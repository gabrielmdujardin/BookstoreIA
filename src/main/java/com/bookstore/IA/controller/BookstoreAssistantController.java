package com.bookstore.IA.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bookstore")
public class BookstoreAssistantController {

    private final ChatClient chatClient;

    public BookstoreAssistantController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/informations")
    public String bookstoreChat(@RequestParam(value = "message", defaultValue = "Quais são os livros best sellers dos ultimos anos?")String message) {

        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }
}