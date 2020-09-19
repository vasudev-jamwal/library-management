package com.assignment.library.service;

import com.assignment.library.domain.Book;
import com.assignment.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	@Transactional
	public List<Book> getbooks() {
		return bookRepository.getAllBooks();
	}

	@Transactional
	public Book enterBook(String subject, String title, String author) {
		return bookRepository.createBook(subject, title, author);
	}
}
