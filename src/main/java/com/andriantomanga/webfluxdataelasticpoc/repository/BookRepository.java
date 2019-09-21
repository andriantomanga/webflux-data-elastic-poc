package com.andriantomanga.webfluxdataelasticpoc.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.andriantomanga.webfluxdataelasticpoc.entity.Book;

@Repository
public interface BookRepository extends ElasticsearchRepository<Book, String> {

}
