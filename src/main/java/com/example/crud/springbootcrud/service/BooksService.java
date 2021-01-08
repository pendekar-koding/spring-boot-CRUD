package com.example.crud.springbootcrud.service;

import com.example.crud.springbootcrud.common.exception.StudyException;
import com.example.crud.springbootcrud.wrapper.BooksWrapper;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BooksService {

    BooksWrapper save(BooksWrapper wrapper) throws StudyException;

    BooksWrapper getById(Long id) throws StudyException;

    Boolean delete(Long pk) throws StudyException;

    List<BooksWrapper> getAll() throws StudyException;

    void deleteAll() throws StudyException;

    Page<BooksWrapper> getPageableList(String sSearch, int startPage, int pageSize) throws StudyException;
}
