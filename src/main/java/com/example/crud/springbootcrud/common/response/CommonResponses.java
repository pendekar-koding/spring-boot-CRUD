package com.example.crud.springbootcrud.common.response;


import com.example.crud.springbootcrud.common.controller.BaseController;

public class CommonResponses<T> extends BaseController {

	public CustomReturn<T> commonSuccessResponse(T wrapper) {
		CustomReturn<T> customReturn = new CustomReturn<>();
		customReturn.setMessage(STR_SUCCESS);
		customReturn.setStatus("200");
		customReturn.setDatas(wrapper);
		return customReturn;
	}

	public CustomReturn<T> commonFailedResponse() {
		CustomReturn<T> customReturn = new CustomReturn<>();
		customReturn.setMessage(STR_FAILED);
		customReturn.setStatus("200");
		return customReturn;
	}

	public CustomReturn<T> commonFailedError() {
		CustomReturn<T> customReturn = new CustomReturn<>();
		customReturn.setMessage(STR_ERROR);
		customReturn.setStatus("500");
		return customReturn;
	}

	public CustomReturn<T> commonDeleteSuccess(){
		CustomReturn<T> customReturn = new CustomReturn<>();
		customReturn.setMessage(STR_SUCCESS);
		customReturn.setStatus("200");
		return customReturn;
	}

}
