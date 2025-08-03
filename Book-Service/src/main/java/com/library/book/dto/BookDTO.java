package com.library.book.dto;

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
public class BookDTO {

	private String id;
	private String bookName;
	private String bookAuthor;
	private String bookCategory;
	private String subject;
	private int bookQuantity;
}
