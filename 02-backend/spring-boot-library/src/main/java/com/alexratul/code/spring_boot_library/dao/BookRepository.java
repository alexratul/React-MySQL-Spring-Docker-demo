package com.alexratul.code.spring_boot_library.dao;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexratul.code.spring_boot_library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    
}