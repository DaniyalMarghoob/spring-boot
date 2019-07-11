package com.daniyal.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.daniyal.springframework.spring5webapp.model.Author;

public interface AuthorRepo extends CrudRepository<Author, Long>{

}
