package com.demo.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", columnDefinition = "VARCHAR(255)")
    private String title;

    @Column(name="price", columnDefinition = "DECIMAL(10,2)")
    private Float price;

    @Column(name="author", columnDefinition = "VARCHAR(255)")
    private String author;

    @Column(name="availableQuantity", columnDefinition = "INTEGER")
    private Integer availableQuantity;

    @Column(name="pageCount", columnDefinition = "INTEGER")
    private Integer pageCount;

    @Column(name="genre", columnDefinition = "VARCHAR(255)")
    private String genre;

    @Column(name="language", columnDefinition = "VARCHAR(255)")
    private String language;

    @Column(name="countyOfOrigin", columnDefinition = "VARCHAR(255)")
    private String countryOfOrigin;

    @Column(name="typeOfCover", columnDefinition = "VARCHAR(255)")
    private String typeOfCover;

    @Column(name="weight", columnDefinition = "INTEGER")
    private Integer weight;

    @Column(name="dimensionX", columnDefinition = "VARCHAR(255)")
    private Integer dimensionX;

    @Column(name="dimensionY", columnDefinition = "VARCHAR(255)")
    private Integer dimensionY;

    @Column(name="description", columnDefinition = "TEXT")
    private String description;

}
