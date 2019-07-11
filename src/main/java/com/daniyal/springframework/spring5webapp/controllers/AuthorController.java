package com.daniyal.springframework.spring5webapp.controllers;

import com.daniyal.springframework.spring5webapp.repositories.AuthorRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Daniyal Marghoob
 */
@Controller
public class AuthorController {

    private AuthorRepo authorRepository;

    public AuthorController(AuthorRepo authorRepository) {
        this.authorRepository = authorRepository;
    }

    @RequestMapping("/authors")
    public String getAuthors(Model model){

        model.addAttribute("authors", authorRepository.findAll());

        return "authors";
    }
}
