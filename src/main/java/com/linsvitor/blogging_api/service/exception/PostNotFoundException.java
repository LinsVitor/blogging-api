package com.linsvitor.blogging_api.service.exception;

public class PostNotFoundException extends RuntimeException {
    public PostNotFoundException(String id) {
        super("Resource not found. Id " + id);
    }
}
