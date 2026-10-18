package com.alexratul.spring_boot_library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.alexratul.spring_boot_library.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    
}
