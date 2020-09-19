package com.assignment.library.domain;

import javax.persistence.*;
import java.util.Date;

public class Record {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Book issuedBook;

	@OneToOne
	private Member issuedTo;

	@Column
	private Date dateOfIssue;

	@Column
	boolean currentlyIssued;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Book getIssuedBook() {
		return issuedBook;
	}

	public void setIssuedBook(Book issuedBook) {
		this.issuedBook = issuedBook;
	}

	public Member getIssuedTo() {
		return issuedTo;
	}

	public void setIssuedTo(Member issuedTo) {
		this.issuedTo = issuedTo;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public boolean isCurrentlyIssued() {
		return currentlyIssued;
	}

	public void setCurrentlyIssued(boolean currentlyIssued) {
		this.currentlyIssued = currentlyIssued;
	}
}
