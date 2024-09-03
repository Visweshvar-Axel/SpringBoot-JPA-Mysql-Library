package com.library.MysqlLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.MysqlLibrary.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
