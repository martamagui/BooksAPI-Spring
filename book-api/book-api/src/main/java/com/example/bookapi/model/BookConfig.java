package com.example.bookapi.model;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Bookstable book = new Bookstable(
                    "50 palos: ... y sigo soñando ",
                    "Pau Donés",
                    "Biografía",
                    "17.95 €"
            );
            Bookstable book2 = new Bookstable(
                    "50 ",
                    "Pau Donés",
                    "Biografía",
                    "17.95 €"
            );

        };
    }
}
