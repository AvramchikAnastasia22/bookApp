package com.bookapp.BookApp.controller;

import com.bookapp.BookApp.model.Book;
import com.bookapp.BookApp.service.BookService;
import com.bookapp.BookApp.service.serviceImpl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookServiceImpl service;

    @PostMapping("/createBook")
    public Book createBook(@RequestBody Book book) {
        return service.createBook(book);
    }

    @GetMapping("/getAllBooks")
    public List<Book> getAllBook() {
        return service.getAllBooks();
    }

    @DeleteMapping("/delete/book/{id}")
    public void deleteBook(@PathVariable(name = "id") Integer bookId) {
        service.deleteBook(bookId);
    }

    @PutMapping("/update/book")
    public Book updateBook(@RequestBody Book book) {
        return service.updateBook(book);
    }

    @GetMapping("/getBookById/{id}")
    public Book getAllBook(@PathVariable(name = "id") Integer bookId) {
        return service.getBookById(bookId);
    }


}
