package com.alexratul.spring_boot_library.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alexratul.spring_boot_library.entity.Book;
import com.alexratul.spring_boot_library.service.BookService;

@RestController 
@RequestMapping ("/api/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping 
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

}
