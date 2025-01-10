package com.muhammedcbkc.EnglishVocabularyLearningApplicationAPI.enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
public enum UserRole {
    ADMIN("admin"),
    USER("user");
  
    private String role;
    
  
  }
