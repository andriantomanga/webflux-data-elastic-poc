package com.andriantomanga.webfluxdataelasticpoc.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import lombok.Data;
import lombok.ToString;

@Document(indexName = "books", type = "user")
@Data
@ToString
public class Book {
	@Id
	private String isbn;
	private String title;
	private String author;
	private Date publicationDate;
}
