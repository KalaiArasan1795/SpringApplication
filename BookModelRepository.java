package com.bookcatalouge.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bookcatalouge.demo.entity.Book;


public interface BookModelRepository extends JpaRepository<Book, Integer> {

	@Query("SELECT b FROM Book b WHERE b.title LIKE '%?1%'")
	public List<Book> findByTitle(String title);

	@Query("SELECT b FROM Book b WHERE b.author LIKE '%?1%'")
	public List<Book> findByAuthor(String author);
}
