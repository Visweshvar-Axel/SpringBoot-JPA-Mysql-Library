package com.library.MysqlLibrary.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.MysqlLibrary.model.Book;
import com.library.MysqlLibrary.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepo bookRepo;

    @Override
    public Book addBooks(Book book) {
        return bookRepo.save(book);
    }

    @Override
    public Book getById(Long id) {
        return bookRepo.findById(id).get();
    }

}
