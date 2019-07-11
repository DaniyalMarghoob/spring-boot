package com.daniyal.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.daniyal.springframework.spring5webapp.model.Publisher;

public interface PublisherRepo extends CrudRepository<Publisher, Long>{

}
