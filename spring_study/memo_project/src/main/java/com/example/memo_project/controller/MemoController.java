package com.example.memo_project.controller;

import com.example.memo_project.domain.MemoRepository;
import com.example.memo_project.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class MemoController {

    private final MemoRepository memoRepository;
    private final MemoService memoService;
}