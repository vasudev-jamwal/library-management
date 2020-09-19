package com.assignment.library.repository;

import com.assignment.library.domain.Book;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;


@Repository
public class BookRepository extends AbstractRepository {

	public List<Book> getAllBooks() {
		TypedQuery<Book> query = getEntityManager().createQuery("select DISTINCT book from Book book", Book.class);

		return query.getResultList();
	}

	public Book createBook(String subject, String title, String author) {
		Book book = new Book();
		book.setTitle(title);
		book.setSubject(subject);
		book.setAuthor(author);
		getEntityManager().persist(book);
		return book;
	}
}
