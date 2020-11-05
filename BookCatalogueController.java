package com.bookcatalouge.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bookcatalouge.demo.service.BookCatalogueService;
import com.bookcatalouge.demo.entity.Book;

@RestController
public class BookCatalogueController {

	@Autowired
	BookCatalogueService bookCatalogueService;

	@GetMapping("/books")
	private List<Book> getAllBooks() {
		return bookCatalogueService.getAllBooks();
	}

	@PostMapping("/books")
	private int saveBooks(@RequestBody Book book) {
		bookCatalogueService.saveOrUpdate(book);
		return book.getIsbn();
	}

	@GetMapping("/books/{id}")
	private Book getBook(@PathVariable("id") int id) {
		return bookCatalogueService.getBookById(id);
	}


	@GetMapping("/bookByTitle/{title}")
	private List<Book> getBookByTitle(@PathVariable("title") String title) {
		return bookCatalogueService.getBookByTitle(title);
	}

	@GetMapping("/booksByAuthor/{author}")
	private List<Book> getBookByAuthor(@PathVariable("author") String author) {
		return bookCatalogueService.getBookByAuthor(author);
	}

	@DeleteMapping("/books/{id}")
	private void deleteBookById(@PathVariable("id") int id) {
		bookCatalogueService.delete(id);
	}


}
