package com.staedy.week01.practice;

public class Course {
    public String title;
    public String tutor;
    public int days;

    // 이렇게 아무런 파라미터가 없는 생성자를 기본생성자라고 한다.
    public Course() {

    }

    public Course(String title, String tutor, int days) {
        // this 는 클래스 변수를 가리킨다.
        this.title = title;
        this.tutor = tutor;
        this.days = days;
    }

    // Getter
    public String getTitle() {
        return this.title;
    }

    // Getter
    public String getTutor() {
        return this.tutor;
    }

    // Getter
    public int getDays() {
        return this.days;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    // Setter
    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    // Setter
    public void setDays(int days) {
        this.days = days;
    }

}