package com.example.springbootjpa.controller;// BookController.java
import com.example.springbootjpa.entity.Book;
import com.example.springbootjpa.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {  
  
    @Autowired  
    private BookService bookService;
  
    // 假设我们接收一个JSON对象作为请求体，其中包含title和author字段  
    @GetMapping("/books")
    public String addBook() {
        Book book = new Book();
        book.setId(2L);
        book.setTitle("aaa");
        book.setAuthor("ccc");
        bookService.saveBook(book);
        return "Book added successfully";  
    }  

}