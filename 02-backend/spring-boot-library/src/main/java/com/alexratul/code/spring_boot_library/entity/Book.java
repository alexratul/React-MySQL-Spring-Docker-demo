package com.alexratul.code.spring_boot_library.entity;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name="book")
@Data
public class Book{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "title", nullable = false, length = 255)
    private String title;

    @Column(name = "author", nullable = false, length = 255)
    private String author;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "copies")
    private Integer copies;

    @Column(name = "copies_available")
    private Integer copiesAvailable;

    @Column(name = "category", length = 100)
    private String category;

    @Column(name = "img")
    private String img;

    // @Column(name = "created_at")
    // private LocalDateTime createdAt;

    // @Column(name = "updated_at")
    // private LocalDateTime updatedAt;

}