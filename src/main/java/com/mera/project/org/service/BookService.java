package com.mera.project.org.service;

import com.mera.project.org.model.Books;
import com.mera.project.org.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BooksRepository booksRepository;

    public void updateSingleBook(Books books) {
        booksRepository.save(books);
    }

    public void updateAllBook(List<Books> books) {
        booksRepository.saveAll(books);
    }
}
