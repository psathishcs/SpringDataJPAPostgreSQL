package com.hello.spring.data.jpa.postgreSQL.repository;

import com.hello.spring.data.jpa.postgreSQL.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    @Query("SELECT b FROM Book b WHERE b.publishDate > :date")
    List<Book> findByPublishDateAfter(@Param("date")LocalDate date);
}
