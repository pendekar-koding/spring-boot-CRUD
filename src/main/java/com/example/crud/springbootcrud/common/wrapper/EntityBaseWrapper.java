package com.example.crud.springbootcrud.common.wrapper;

import java.io.Serializable;

/**
 * Created by josescalia on 01/08/17.
 */
public class EntityBaseWrapper implements Serializable {
    private static final long serialVersionUID = -2173562973290577810L;
    private Long id;
    private String description;

    public EntityBaseWrapper() {
        //default constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
