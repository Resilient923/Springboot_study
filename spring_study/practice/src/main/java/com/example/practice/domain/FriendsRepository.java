package com.example.practice.domain;

import com.example.practice.Friends;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendsRepository extends JpaRepository<Friends, Long> {
}
