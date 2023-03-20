package com.example.demo.Service;

import com.example.demo.Entities.Book;
import com.example.demo.Entities.Profile;
import com.example.demo.Repository.BookRepository;
import com.example.demo.Repository.ProfileRepository;
import org.springframework.stereotype.Service;

@Service

public class BookService {
    private BookRepository bookRepository;

    public Iterable<Book> getProfiles() {
        Iterable<Book> books =bookRepository.findAll();
        return books;
    }
}
