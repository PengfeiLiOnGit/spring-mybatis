package com.jony.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class IndexController {

    @RequestMapping({"","/index"})
    public ModelAndView getUser(){
        LocalDate date = LocalDateTime.now().toLocalDate();
        ModelAndView view = new ModelAndView("index");
        view.addObject("now", new Date());
        return view;
    }
}
