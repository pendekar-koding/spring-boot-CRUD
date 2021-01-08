package com.example.crud.springbootcrud.service.impl;

import com.example.crud.springbootcrud.entity.Books;
import com.example.crud.springbootcrud.entity.repository.BooksRepository;
import com.example.crud.springbootcrud.exception.ErrorCode;
import com.example.crud.springbootcrud.exception.StudyException;
import com.example.crud.springbootcrud.service.BooksService;
import com.example.crud.springbootcrud.wrapper.BooksWrapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BooksServiceImpl implements BooksService {

    private final BooksRepository booksRepository;

    public BooksServiceImpl(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    private BooksWrapper toWrapper(Books entity){
        BooksWrapper wrapper = new BooksWrapper();
        if (entity != null){
            wrapper.setId(entity.getId());
            wrapper.setTitle(entity.getTitle());
            wrapper.setPublisher(entity.getPublisher());
        }

        return wrapper;
    }

    private Books toEntity(BooksWrapper wrapper){
        Books entity = new Books();
        if (wrapper.getId() != null){
            Optional<Books> optionalBooks = booksRepository.findById(wrapper.getId());
            if (optionalBooks.isPresent()){
                entity = optionalBooks.get();
            }
        }
        entity.setTitle(wrapper.getTitle());
        entity.setPublisher(wrapper.getPublisher());
        return entity;
    }

    private List<BooksWrapper> toWrapperList(List<Books> modelList){
        List<BooksWrapper> rList = new ArrayList<>();
        if (modelList != null && !modelList.isEmpty()){
            for (Books entity : modelList){
                rList.add(toWrapper(entity));
            }
        }
        return rList;
    }

    @Override
    public BooksWrapper save(BooksWrapper wrapper) throws StudyException {
        return toWrapper(booksRepository.save(toEntity(wrapper)));
    }

    @Override
    public BooksWrapper getById(Long id) throws StudyException {
       Optional<Books> optionalBooks = booksRepository.findById(id);
       return optionalBooks.map(this::toWrapper).orElse(null);
    }

    @Override
    public Boolean delete(Long pk) throws StudyException {
        try {
            booksRepository.deleteById(pk);
            return true;
        } catch (Exception e){
            throw new StudyException(e, ErrorCode.GENERIC_FAILURE);
        }
    }

    @Override
    public List<BooksWrapper> getAll() throws StudyException {
        return toWrapperList((List<Books>) booksRepository.findAll());
    }

    @Override
    public void deleteAll() throws StudyException {
        //Not implemented yet
    }
}
