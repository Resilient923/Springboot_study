package com.example.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor // 기본생성자를 대신 생성해줌. lombok
@Entity // 테이블임을 나타냅니다.
public class Course {

    @Id // ID 값, Primary Key로 사용하겠다는 뜻
    @GeneratedValue(strategy = GenerationType.AUTO) // (AI)자동 증가 명령
    private Long id;

    @Column(nullable = false) // 컬럼 값이고 반드시 값이 존재해야 함
    private String title;

    @Column(nullable = false)
    private String tutor;

    public Course(CourseRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.title = requestDto.getTutor();
    }

    public Course(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }

    public void update(CourseRequestDto requestDto) {
        this.title = requestDto.getTitle();
        this.tutor = requestDto.getTutor();
    }
}