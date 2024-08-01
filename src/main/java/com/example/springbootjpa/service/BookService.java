package com.example.springbootjpa.service;
  

import com.example.springbootjpa.dao.BookRepository;
import com.example.springbootjpa.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;  
  
import java.util.List;  
  
@Service  
public class BookService {  
  
    @Autowired  
    private BookRepository bookRepository;
  
    public List<Book> findAllBooks() {
        return bookRepository.findAll();  
    }  
  
    public Book saveBook(Book book) {  
        return bookRepository.save(book);  
    }
}