package com.bookapp.BookApp.service.serviceImpl;

import com.bookapp.BookApp.model.Book;
import com.bookapp.BookApp.repository.BookRepository;
import com.bookapp.BookApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository repository;

    @Override
    public Book createBook(Book book) {
        return repository.save(book);
    }

    @Override
    public void deleteBook(Integer bookId) {
        Book book = getBookById(bookId);
        repository.delete(book);
    }

    @Override
    public Book updateBook(Book book) {
        Book newBook = repository.findById(book.getId()).orElse(null);
        if(Objects.nonNull(newBook)){
            newBook.setTitle(book.getTitle());
            newBook.setNameAuthor(book.getNameAuthor());
            newBook.setYearManufacture(book.getYearManufacture());
            newBook.setStyle(book.getStyle());
            newBook.setNumberPages(book.getNumberPages());
            newBook.setDescription(book.getDescription());

        }
        return repository.save(newBook);
    }

    @Override
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @Override
    public Book getBookById(Integer bookId) {
        return repository.findById(bookId).orElse(null);
    }



}
