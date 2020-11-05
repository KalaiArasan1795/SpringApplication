package com.bookcatalouge.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookcatalouge.demo.dao.BookModelRepository;
import com.bookcatalouge.demo.entity.Book;



@Service
public class BookCatalogueService {

	@Autowired
	BookModelRepository bookModelRepository;

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<Book>();
		bookModelRepository.findAll().forEach(book -> books.add(book));
		return books;
	}

	public void saveOrUpdate(Book book) {
		bookModelRepository.save(book);
	}

	public Book getBookById(int id ) {
		return bookModelRepository.findById(id).get();
	}

	public List<Book> getBookByTitle(String title) {
		return bookModelRepository.findByTitle(title);
	}

	public List<Book> getBookByAuthor(String author) {
		return bookModelRepository.findByAuthor(author);
	}

	public void delete(int id) {
		bookModelRepository.deleteById(id);
	}
}
