package com.thecaveman.bookshelves.springbookshelves.repository;

import com.thecaveman.bookshelves.springbookshelves.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
