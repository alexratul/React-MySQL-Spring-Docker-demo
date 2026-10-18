package com.alexratul.spring_boot_library.service;

import com.alexratul.spring_boot_library.entity.Book;
import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
}
