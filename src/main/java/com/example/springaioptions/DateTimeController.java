package com.example.springaioptions;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateTimeController {


    private final ChatClient chatClient;

    public DateTimeController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/tools")
    public String tools() {
        return  chatClient.prompt().user("What date is tomorrow ")
                .tools(DateTimeTools.class)
                .call()
                .content();


    }



}
