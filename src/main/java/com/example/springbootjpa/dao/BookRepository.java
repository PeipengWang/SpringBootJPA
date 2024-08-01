package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
  
public interface BookRepository extends JpaRepository<Book, Long> {
    // 这里可以定义一些自定义的查询方法，但JpaRepository已经提供了基本的CRUD操作  
}