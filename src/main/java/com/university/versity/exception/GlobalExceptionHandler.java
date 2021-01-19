package com.university.versity.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    public String handlerResourceNotFoundException(ResourceNotFoundException e, Model model){
        model.addAttribute("exceptionMsg",e.getMessage());
        return "error/404";
    }
}
