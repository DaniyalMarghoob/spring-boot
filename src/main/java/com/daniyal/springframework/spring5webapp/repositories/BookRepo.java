package com.daniyal.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.daniyal.springframework.spring5webapp.model.Book;

public interface BookRepo extends CrudRepository<Book, Long>{

}
