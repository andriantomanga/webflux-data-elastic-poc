package com.andriantomanga.webfluxdataelasticpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andriantomanga.webfluxdataelasticpoc.entity.Book;
import com.andriantomanga.webfluxdataelasticpoc.service.BookService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@Slf4j
@Api
@SwaggerDefinition(info = @Info(title = "API pour les livres", version = "v1", description = "Cette section regroupe les API pour les livres"))
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@ApiOperation(value = "API pour récupérer tous les livres", response = Book.class)
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public Flux<Book> getAllBooks() {
		log.info("Getting all books ...");
		return bookService.getAllBooks();
	}

	@ApiOperation(value = "API pour ajouter un nouveau livre", response = Book.class)
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public Mono<Book> addBook(@RequestBody Book book) {
		log.info("Adding a new book ...");
		return bookService.addBook(book);
	}

}
