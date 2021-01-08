package com.example.crud.springbootcrud.entity.repository;

import com.example.crud.springbootcrud.entity.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {
}
