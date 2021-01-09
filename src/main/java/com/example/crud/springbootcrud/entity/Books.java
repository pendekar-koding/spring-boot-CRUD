package com.example.crud.springbootcrud.entity;

import com.example.crud.springbootcrud.common.model.ReferenceBase;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Books extends ReferenceBase {


    private String title;
    private String publisher;


    @Column(name = "title", length = 30)
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Column(name = "publisher", length = 30)
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
