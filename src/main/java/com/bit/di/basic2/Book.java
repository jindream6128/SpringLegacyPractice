package com.bit.di.basic2;

public class Book {
    private String author;
    private int price;
    private String publisher;
    private String title;



    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public Book(String author, int price, String publisher, String title) {
        super();
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.title = title;
    }

    public Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", price=" + price +
                ", publisher='" + publisher + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
