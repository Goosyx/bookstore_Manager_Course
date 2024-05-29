package com.SergioMurilo.bookstoremanager.service;

import com.SergioMurilo.bookstoremanager.dto.MessageResponseDTO;
import com.SergioMurilo.bookstoremanager.entity.Book;
import com.SergioMurilo.bookstoremanager.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    private BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public MessageResponseDTO create(Book book) {
        Book savedBook = bookRepository.save(book);
        return MessageResponseDTO.builder().
                messege("Book created with ID: " + savedBook.getId())
                .build();
    }
}
