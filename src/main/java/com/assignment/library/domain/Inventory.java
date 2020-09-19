package com.assignment.library.domain;

import javax.persistence.*;

@Entity
public class Inventory {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToOne
	private Book book;

	@Column
	private long total;

}
