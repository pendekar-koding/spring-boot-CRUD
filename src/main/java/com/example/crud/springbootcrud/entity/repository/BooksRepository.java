package com.example.crud.springbootcrud.entity.repository;

import com.example.crud.springbootcrud.entity.Books;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepository extends CrudRepository<Books, Long> {
    @Query(value = "select b  from Books b where b.title like %:sSearch% or b.publisher like %:sSearch% ")
    Page<Books> getPageable(@Param("sSearch") String sSearch, Pageable pageable);
}
