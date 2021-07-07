package com.staedy.week01.controller;

import com.staedy.week01.practice.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @GetMapping("/myinfo")
    public Person getPerson(){
        Person person = new Person();

        person.setAge(26);
        person.setJob("학생");
        person.setName("skc");
        person.setAddress("서울");
        return person;
    }
}
