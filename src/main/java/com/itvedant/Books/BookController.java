package com.itvedant.Books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Every request comes to here
@RequestMapping("/book")
public class BookController {

	@Autowired
	BookJpa jpa;

	@Autowired
	BookService service;

	@GetMapping("/home/{id}")
	public String first(@PathVariable Integer id) {
		Book book = jpa.findById(id).orElse(null);
		return "Hello from Home\n " + "The name of Book is " + "<h1 style= color:red; margin-left:100px>"
				+ book.getName() + "</h1>";
	}

	@GetMapping("/office")
	public String Second() {
		return "Hello from Office";
	}

	@GetMapping("/login")
	public String Third() {
		String name = "Sandesh";
		return "<h1 style='color:red;margin-left:200px'>Hello from Login " + name + "</h1>";
	}

	@GetMapping("/getbook/{id}")
	public Book getbook(@PathVariable Integer id) {
		return jpa.findById(id).orElse(null);
	}

	@GetMapping("/getall")
	public List<Book> getAllBook() {
		return jpa.findAll();
	}

	@PostMapping("/addbook")
	public Book addbook(@RequestBody Book book) {
		return jpa.save(book);

	}

	@PutMapping("/updatebook/{id}")
	public Book updatebook(@PathVariable Integer id, @RequestBody Book book) {
		return service.update(id, book);
	}

	@PostMapping("/addall")
	public List<Book> addAll(@RequestBody List<Book> listOfBook) {
		return jpa.saveAll(listOfBook);

	}

	@GetMapping("/filteredbooks/{writter}")
	public List<Book> fillData(@PathVariable String writter) {
	    return service.filterBywritter(writter);
	}
}
