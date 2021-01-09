package com.example.crud.springbootcrud.common.controller;

public class BaseController {
    protected static final String STR_SUCCESS = "Success";
    protected static final String STR_FAILED = "Failed";
    protected static final String STR_ERROR = "Error";
    protected static final String STR_CREATED_BY = "SYSTEM";

    @Override
    public String toString() {
        return "BaseController{}";
    }
}
