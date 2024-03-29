package com.mera.project.org.controllers;

import com.mera.project.org.model.Books;
import com.mera.project.org.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class BooksController {

    @Autowired
    private BookService bookService;

    @PostMapping("/book")
    private String createBook(@RequestBody Books books) {
        System.out.println(books);
        bookService.updateSingleBook(books);
        return "Your books are updated in DB.";
    }

    @PostMapping("/books")
    private String saveBook(@RequestBody List<Books> books) {
        System.out.println(books);
        bookService.updateAllBook(books);
        return "Your books are updated in DB.";
    }

//    @GetMapping("/book2")
//    private List<Books> getAllBooks() {
//        return null;
//    }
}
