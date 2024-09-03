package com.library.MysqlLibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.MysqlLibrary.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
