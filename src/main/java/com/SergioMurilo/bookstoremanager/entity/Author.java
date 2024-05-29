package com.SergioMurilo.bookstoremanager.entity;

import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = false)
    private String name;

    @Column(nullable = false)
    private Integer age;
}
