package com.example.crud.springbootcrud.common.exception;

public class StudyException extends Exception {
    private static final long serialVersionUID = 6270116931011412328L;

    private final ErrorCode errorCode;

    public StudyException(ErrorCode code){
        super();
        this.errorCode = code;
    }

    public StudyException(String message, Throwable cause, ErrorCode code){
        super(message, cause);
        this.errorCode = code;
    }

    public StudyException(String message, ErrorCode code){
        super(message);
        this.errorCode = code;
    }

    public StudyException(Throwable cause, ErrorCode code){
        super(cause);
        this.errorCode = code;
    }

    public ErrorCode getCode(){
        return this.errorCode;
    }

}
