package com.assignment.library;

import com.assignment.library.domain.Book;
import com.assignment.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class LibraryManagementApplication {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(LibraryManagementApplication.class, args);
	}

	@PostConstruct
	public void init() {
		bookService.enterBook("Physics", "Class XII Problems", "HC VERMA");
		bookService.enterBook("Chemistry", "Organic Chem", "Pradeep");
		bookService.enterBook("Maths", "Statistics", "Pradeep");
		bookService.enterBook("Bio", "Flora and Fauna", "HC Pradeep");
	}
}
