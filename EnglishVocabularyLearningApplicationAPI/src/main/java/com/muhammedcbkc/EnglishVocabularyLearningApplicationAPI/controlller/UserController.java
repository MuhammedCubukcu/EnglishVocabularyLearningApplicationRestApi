package com.muhammedcbkc.EnglishVocabularyLearningApplicationAPI.controlller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserController {

    @GetMapping("/user")
    public String get() {
        return "User get";
    }
    
}