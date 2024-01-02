package com.hello.spring.data.jpa.postgreSQL.service;

import com.hello.spring.data.jpa.postgreSQL.model.Book;
import com.hello.spring.data.jpa.postgreSQL.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }


    public List<Book> findAll(){
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id){
        return bookRepository.findById(id);
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public void deleteById(Long id){
        bookRepository.deleteById(id);
    }

    public List<Book> findByTitle(String title){
        return bookRepository.findByTitle(title);
    }

    public List<Book> findByPublishDateAfter(LocalDate date){
        return bookRepository.findByPublishDateAfter(date);
    }

}
