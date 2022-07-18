package com.swjd.controller;

import com.sun.javafx.collections.ImmutableObservableList;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController {
@ExceptionHandler({com.swjd.exception.UserNotFoundException.class})
    public String toString(Exception e, Model model){
    model.addAttribute("msg",e.getMessage());
    return "redirect:/page/signin";
}
@ExceptionHandler({java.lang.Exception.class})
    public  String toError(Exception e,Model model){
    model.addAttribute("msg",e.getMessage());
    return "error";
}
}
