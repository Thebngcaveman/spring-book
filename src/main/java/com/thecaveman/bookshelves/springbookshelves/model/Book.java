package com.thecaveman.bookshelves.springbookshelves.model;

import javax.persistence.*;

@Entity
@Table(name = "BookShelves")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String bookType;
    private String description;
    private String imgUrl;

    public Book() {
    }

    public Book(Long id, String name, String bookType, String description,String imgUrl) {
        this.id = id;
        this.name = name;
        this.bookType = bookType;
        this.description = description;
        this.imgUrl = imgUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
