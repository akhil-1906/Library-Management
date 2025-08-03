package com.library.book.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name= "Book_Details", uniqueConstraints = {@UniqueConstraint(columnNames = {"bookName","bookAuthor"})})
public class BookEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private String id;
	@NotBlank(message = "Book Name cannot be Null")
	private String bookName;
	private String bookAuthor;
	private String bookCategory;
	private String subject;
	private int bookQuantity;
}
