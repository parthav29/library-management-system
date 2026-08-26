package org.springboot.librarymanagement.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String author;
	@Column(nullable = false)
	private String publisher;
	@Column(nullable = false)
	private String category;
	@Column(nullable = false)
	private String isbn;
	@Column(nullable = false)
	private LocalDate publishedDate;
	@Column(nullable = false)
	private int totalCopies;
	@Column(nullable = false)
	private int availableCopies;

}
