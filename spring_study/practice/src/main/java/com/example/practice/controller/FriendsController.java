package com.example.practice.controller;


import com.example.practice.Friends;
import com.example.practice.domain.FriendsRepository;
import com.example.practice.models.FriendsRequestDto;
import com.example.practice.service.FriendsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class FriendsController {

    private final FriendsService friendsService;
    private final FriendsRepository friendsRepository;

    @GetMapping("/api/friends")
    public List<Friends> getFreinds() {
        return friendsRepository.findAll();
    }

    @PostMapping("/api/friends")
    public Friends createFriends(@RequestBody FriendsRequestDto requestDto) {
        Friends friends = new Friends(requestDto);
        return friendsRepository.save(friends);
    }

    @PutMapping("/api/friends/{id}")
    public Long updateFriends(@PathVariable Long id, @RequestBody FriendsRequestDto requestDto) {
        return friendsService.update(id, requestDto);
    }

    @DeleteMapping("/api/friends/{id}")
    public Long deleteFriends(@PathVariable Long id) {
        friendsRepository.deleteById(id);
        return id;
    }

}
