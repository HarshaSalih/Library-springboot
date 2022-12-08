package com.example.libraryapp_backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Library")

public class Library {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String bookTitle;
    private String author;
    private String description;
    private String publisher;
    private String language;
    private String distributor;
    private String releasedYear;
    private int price;
    private String image;

    public Library() {
    }

    public Library(int id, String bookTitle, String author, String description, String publisher, String language, String distributor, String releasedYear, int price, String image) {
        this.id = id;
        this.bookTitle = bookTitle;
        this.author = author;
        this.description = description;
        this.publisher = publisher;
        this.language = language;
        this.distributor = distributor;
        this.releasedYear = releasedYear;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getReleasedYear() {
        return releasedYear;
    }

    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
