package com.alexratul.spring_boot_library.service;

import com.alexratul.spring_boot_library.entity.Book;
import org.springframework.data.domain.Page;

public interface BookService {
    Page<Book> getAllBooks(int pageNo, int pageSize);
}
