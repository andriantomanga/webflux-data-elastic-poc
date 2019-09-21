package com.andriantomanga.webfluxdataelasticpoc.service;

import com.andriantomanga.webfluxdataelasticpoc.entity.Book;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

	Flux<Book> getAllBooks();
	
	Mono<Book> addBook(Book book);
}
