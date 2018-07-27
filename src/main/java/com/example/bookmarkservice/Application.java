package com.example.bookmarkservice;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.bookmarkservice.model.Account;
import com.example.bookmarkservice.model.AccountRepository;
import com.example.bookmarkservice.model.Bookmark;
import com.example.bookmarkservice.model.BookmarkRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(AccountRepository accountRepository, BookmarkRepository bookmarkRepository) {
		return args -> Arrays.asList("jhoeller", "dsyer", "pwebb", "ogierke", "rwinch", "mfisher", "mpollack", "jlong")
				.forEach(username -> {
					Account account = accountRepository.save(new Account(username, "password"));
					bookmarkRepository
							.save(new Bookmark(account, "http://bookmark.com/1/" + username, "A description"));
					bookmarkRepository
							.save(new Bookmark(account, "http://bookmark.com/2/" + username, "A description"));
				});
	}

}