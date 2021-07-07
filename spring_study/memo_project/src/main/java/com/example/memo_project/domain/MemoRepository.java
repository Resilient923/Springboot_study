package com.example.memo_project.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo, Long> {//Memo 라는 클래스에 Id는 Long인 애한테 쓸꺼야.
    List<Memo> findAllByOrderByModifiedAtDesc();
}
