package com.example.aimind.Controller;
import com.example.aimind.Model.ChatRequest;
import com.example.aimind.Model.ChatResponse;
import com.example.aimind.Services.AiMindPrompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/bot")
public class BotController {


    private final AiMindPrompt postPrompt;

    @Value("${openai.model}")
    private String model;

    @Value("${openai.api.url}")
    private String apiURL;

    @Autowired
    @Qualifier("openaiRestTemplate")
    private RestTemplate openaiRestTemplate;

    public BotController(AiMindPrompt postPrompt) {
        this.postPrompt = postPrompt;
    }


    @GetMapping("/ai-mind")
    public String chat(@RequestParam String prompt, Model modelone){
        ChatRequest request = new ChatRequest(model, postPrompt.defaultPrompt(prompt) );
        ChatResponse chatResponse = openaiRestTemplate.postForObject(apiURL,request,ChatResponse.class);
        modelone.addAttribute("response",chatResponse.getChoices().get(0).getMessage().getContent());
        System.out.println(chatResponse.getChoices().get(0).getMessage().getContent());
        return chatResponse.getChoices().get(0).getMessage().getContent();
    }


}