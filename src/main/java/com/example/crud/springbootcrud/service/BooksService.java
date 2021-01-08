package com.example.crud.springbootcrud.service;

import com.example.crud.springbootcrud.exception.StudyException;
import com.example.crud.springbootcrud.wrapper.BooksWrapper;

import java.util.List;

public interface BooksService {

    BooksWrapper save(BooksWrapper wrapper) throws StudyException;

    BooksWrapper getById(Long id) throws StudyException;

    Boolean delete(Long pk) throws StudyException;

    List<BooksWrapper> getAll() throws StudyException;

    void deleteAll() throws StudyException;
}
