package com.example.crud.springbootcrud.controller;

import com.example.crud.springbootcrud.common.controller.BaseController;
import com.example.crud.springbootcrud.common.response.CommonResponses;
import com.example.crud.springbootcrud.common.response.CustomReturn;
import com.example.crud.springbootcrud.exception.StudyException;
import com.example.crud.springbootcrud.service.BooksService;
import com.example.crud.springbootcrud.wrapper.BooksWrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/master/books")
public class BooksController extends BaseController {

    private final BooksService booksService;

    public BooksController(BooksService booksService) {
        this.booksService = booksService;
    }
    @GetMapping(value = "/list")
    public CustomReturn<List<BooksWrapper>> getListEmergency() throws StudyException {
        CommonResponses<List<BooksWrapper>> commonResponses = new CommonResponses<>();
        List<BooksWrapper> books = booksService.getAll();
        if (books != null) {
            return commonResponses.commonSuccessResponse(books);
        } else {
            return commonResponses.commonFailedResponse();
        }
    }
}
