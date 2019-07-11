package com.daniyal.springframework.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.daniyal.springframework.spring5webapp.model.Author;
import com.daniyal.springframework.spring5webapp.model.Book;
import com.daniyal.springframework.spring5webapp.model.Publisher;
import com.daniyal.springframework.spring5webapp.repositories.AuthorRepo;
import com.daniyal.springframework.spring5webapp.repositories.BookRepo;
import com.daniyal.springframework.spring5webapp.repositories.PublisherRepo;

/**
 * Created by Daniyal Marghoob.
 */
@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepo authorRepository;
    private BookRepo bookRepository;
    private PublisherRepo publisherRepository;

    public DevBootstrap(AuthorRepo authorRepository, BookRepo bookRepository, PublisherRepo publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
    	
    	   //Daniyal
       Publisher dani = new Publisher("Daniyal Marghoob", "Tampere, Finland");
       publisherRepository.save(dani);
       

        //Eric
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234", dani);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);


        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", dani );
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        

    }
}