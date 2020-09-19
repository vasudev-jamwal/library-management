package com.assignment.library.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	private static final String ISSUE_BOOK_BY_USER = "/user/{userId}/book/{bookId}";

	@PostMapping(value = ISSUE_BOOK_BY_USER)
	public ResponseEntity issueBook(
			@PathVariable("userId") Long userId,
			@PathVariable("bookId") Long bookId
	) {

		//TODO: check whether userId and bookId are valid

		//TODO: check whether the book is available

		//TODO: check whether the user already has the book issued

		//TODO: check whether the user already has 3 books assigned

		//TODO: create a record with the user and book in Record Table

		return ResponseEntity.ok().body("Return in 10 Days");
	}
}
