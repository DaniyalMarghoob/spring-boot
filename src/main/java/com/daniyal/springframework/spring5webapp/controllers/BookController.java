package com.daniyal.springframework.spring5webapp.controllers;

import com.daniyal.springframework.spring5webapp.repositories.BookRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniyal Marghoob
 */
@Controller
public class BookController {

    private BookRepo bookRepository;

    public BookController(BookRepo bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}