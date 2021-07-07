package com.example.practice.service;

import com.example.practice.Friends;
import com.example.practice.domain.FriendsRepository;
import com.example.practice.models.FriendsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class FriendsService {
    private final FriendsRepository friendsRepository;

    @Transactional
    public Long update(Long id, FriendsRequestDto requestDto) {
        Friends friends = friendsRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 이름이 없습니다.")
        );
        friends.update(requestDto);
        return friends.getId();
    }
}
