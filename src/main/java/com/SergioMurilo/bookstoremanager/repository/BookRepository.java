package com.SergioMurilo.bookstoremanager.repository;

import com.SergioMurilo.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
