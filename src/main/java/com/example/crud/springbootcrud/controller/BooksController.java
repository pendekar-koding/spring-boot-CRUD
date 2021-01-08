package com.example.crud.springbootcrud.controller;

import com.example.crud.springbootcrud.common.controller.BaseController;
import com.example.crud.springbootcrud.common.exception.StudyException;
import com.example.crud.springbootcrud.common.response.CommonResponses;
import com.example.crud.springbootcrud.common.response.CustomReturn;
import com.example.crud.springbootcrud.service.BooksService;
import com.example.crud.springbootcrud.wrapper.BooksWrapper;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/id/{id}")
    public CustomReturn<BooksWrapper> getById(@PathVariable Long id) throws StudyException {
        CommonResponses<BooksWrapper> commonResponses = new CommonResponses<>();
        try {
            BooksWrapper wrapper = booksService.getById(id);
            if (wrapper!= null) {
                return commonResponses.commonSuccessResponse(wrapper);
            } else {
                return commonResponses.commonFailedResponse();
            }
        } catch (Exception e) {
            return commonResponses.commonFailedError();
        }
    }

    @PostMapping(value = "/save")
    public CustomReturn<BooksWrapper> save(@RequestBody BooksWrapper booksWrapper) throws StudyException{
        CommonResponses<BooksWrapper> commonResponses = new CommonResponses<>();
        BooksWrapper wrapper = booksService.save(booksWrapper);
        if (wrapper != null){
            return commonResponses.commonSuccessResponse(wrapper);
        }else {
            return commonResponses.commonFailedResponse();
        }
    }

    @PostMapping(value = "/delete/{id}")
    public CustomReturn<BooksWrapper> delete(@PathVariable Long id) throws StudyException{
        CommonResponses<BooksWrapper> commonResponses = new CommonResponses<>();
        boolean result = booksService.delete(id);
        if (result){
            return commonResponses.commonDeleteSuccess();
        } else {
            return commonResponses.commonFailedResponse();
        }
    }

}
