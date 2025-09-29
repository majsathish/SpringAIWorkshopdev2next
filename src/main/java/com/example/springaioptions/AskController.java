package com.example.springaioptions;


import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.client.advisor.SimpleLoggerAdvisor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AskController {

    private final ChatClient chatClient;


    @Value("classpath:/promptTemplates/systemPrompt.st")
    Resource systemPrompt;


    public AskController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @PostMapping("/ask")
    public String ask(@RequestBody Question question) {
        return this.chatClient.prompt()
                .system(promptSystemSpec -> promptSystemSpec
                        .text(systemPrompt)
                    //    .param("persona", question.persona())
                )
                        .user(question.question())
                .advisors(SimpleLoggerAdvisor.builder().build()

                )
                        .call()
             //           .entity(String[].class);
                .content();



    }

}
