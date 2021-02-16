package com.thecaveman.bookshelves.springbookshelves.service;

import com.thecaveman.bookshelves.springbookshelves.model.Book;
import com.thecaveman.bookshelves.springbookshelves.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getBookById(Long id){
        return bookRepository.findById(id).get();
    }

    public void saveBook(Book book){
        bookRepository.save(book);
    }

    public void deleteBookById(Long id){
        bookRepository.deleteById(id);
    }
}
