package com.bookapp.BookApp.service;

import com.bookapp.BookApp.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    Book createBook(Book book);

    void deleteBook(Integer bookId);

    Book updateBook(Book book);

    List<Book> getAllBooks();

    Book getBookById(Integer bookId);




}
