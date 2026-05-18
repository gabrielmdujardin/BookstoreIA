package com.bookstore.IA.controller;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookstore")
public class BookstoreAssistantController {

    private final ChatClient chatClient;

    public BookstoreAssistantController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/informations")
    public String bookstoreChat(@RequestParam(value = "message", defaultValue = "Quais são os livros best sellers dos ultimos anos?") String message) {

        return chatClient.prompt()
                .user(message)
                .call()
                .content();
    }

    @GetMapping("/review")
    public String bookReview(@RequestParam String bookName) {

        String prompt = """
                Faça uma review do livro: %s.
                
                A review deve conter:
                - Resumo breve da obra
                - Pontos positivos
                - Pontos negativos, se houver
                - Para quem o livro é recomendado
                - Nota final de 0 a 10
                
                Responda em português do Brasil.
                """.formatted(bookName);

        return chatClient.prompt()
                .user(prompt)
                .call()
                .content();
    }
}