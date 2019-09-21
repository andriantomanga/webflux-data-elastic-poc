package com.andriantomanga.webfluxdataelasticpoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andriantomanga.webfluxdataelasticpoc.entity.Book;
import com.andriantomanga.webfluxdataelasticpoc.repository.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Flux<Book> getAllBooks() {
		return Flux.fromIterable(bookRepository.findAll());
	}

	@Override
	public Mono<Book> addBook(Book book) {
		return Mono.just(bookRepository.save(book));
	}

}
