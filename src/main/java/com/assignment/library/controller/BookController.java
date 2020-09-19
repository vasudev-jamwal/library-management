package com.assignment.library.controller;

import com.assignment.library.domain.Book;
import com.assignment.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class BookController {

	@Autowired
	private BookService bookService;

	@GetMapping("/books")
	public List<Book> findBooks() {
		return bookService.getbooks();
	}

}
