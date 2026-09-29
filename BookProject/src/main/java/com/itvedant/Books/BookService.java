package com.itvedant.Books;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

	@Autowired
	BookJpa jpa;

	public Book update(Integer id, Book book) {
		Book previousBook = jpa.findById(id).orElse(null);

		if (book.getName() == null) {
			previousBook.setName(previousBook.getName());
		} else {
			previousBook.setName(book.getName());
		}

		if (book.getPass() == null) {
			previousBook.setPass(previousBook.getPass());
		} else {
			previousBook.setPass(book.getPass());
		}

		if (book.getPrice() == null) {
			previousBook.setPrice(previousBook.getPrice()); // keep old price
		} else {
			previousBook.setPrice(book.getPrice()); // update with new price
		}

		if (book.getWritter() == null) {
			previousBook.setWritter(previousBook.getWritter());
		} else {
			previousBook.setWritter(book.getWritter());
		}
		return jpa.save(previousBook);
	}

	List<Book> filterBywritter(String writter) {
	    List<Book> allBookList = jpa.findAll();

	    List<Book> filteredBooks = allBookList.stream()
	            .filter(book -> writter.equals(book.getWritter()))
	            .collect(Collectors.toList());

	    return filteredBooks;
	}

}
