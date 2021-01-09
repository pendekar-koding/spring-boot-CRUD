package com.example.crud.springbootcrud.wrapper;

import com.example.crud.springbootcrud.common.wrapper.ReferenceBaseWrapper;

public class BooksWrapper extends ReferenceBaseWrapper {


    private String title;
    private String publisher;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "BooksWrapper{" +
                "title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
