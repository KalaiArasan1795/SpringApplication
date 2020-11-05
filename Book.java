package com.bookcatalouge.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	@GeneratedValue
	@Column(name = "isbn")
	private int isbn;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;

	public Book() {
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setId(Integer isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
