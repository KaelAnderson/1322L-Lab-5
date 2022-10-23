package com.company;

public class Book extends Item {
    private int isbn_number;
    public String author;
    public int getIsbn_number() {
        return isbn_number;
    }
    public String getAuthor() {
        return author;
    }
    public void setIsbn_number(int inputIsbn) {
        isbn_number = inputIsbn;
    }
    public void setAuthor(String inputAuthor) {
        author = inputAuthor;
    }
    Book(){}
    Book(int inputIsbn, String inputAuthor, String inputTitle){
        super(inputTitle);
        isbn_number = inputIsbn;
        author = inputAuthor;
    }

    @Override
    public String getListing() {
        return "Book Name - " + getTitle() + "\n" +
                "Author - " + getAuthor() + "\n" +
                "ISBN # - " + getIsbn_number() + "";
    }
}
