package com.example.aimind.Services;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class AiMindPrompt {
    public String defaultPrompt(String prompt){
        return "Can you make this sound better," + prompt;
    }
}
