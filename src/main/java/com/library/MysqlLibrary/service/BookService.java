package com.library.MysqlLibrary.service;

import com.library.MysqlLibrary.model.Book;

public interface BookService {

    Book addBooks(Book book);

    Book getById(Long id);

}