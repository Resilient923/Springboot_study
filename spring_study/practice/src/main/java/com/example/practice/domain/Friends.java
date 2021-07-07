package com.example.practice;


import com.example.practice.models.FriendsRequestDto;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Entity
public class Friends {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String hobby;

    public Friends(FriendsRequestDto requestDto) {
        this.age = requestDto.getAge();
        this.name = requestDto.getName();
        this.hobby = requestDto.getHobby();
    }

    public Long getId() {
        return id;
    }

    public void update(FriendsRequestDto requestDto) {
        this.age = requestDto.getAge();
        this.name = requestDto.getName();
        this.hobby = requestDto.getHobby();
    }
}
