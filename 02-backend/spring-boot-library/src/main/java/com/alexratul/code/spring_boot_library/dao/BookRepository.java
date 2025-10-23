package com.alexratul.code.spring_boot_library.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import com.alexratul.code.spring_boot_library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    Page<Book> findByTitleContaining(@RequestParam("title") String title,
            org.springframework.data.domain.Pageable pageable);

    Page<Book> findByCategoryContaining(@RequestParam("category") String category,
            org.springframework.data.domain.Pageable pageable);
}