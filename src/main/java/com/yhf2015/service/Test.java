package com.yhf2015.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class Test {
	@RequestMapping(value="s.do")  
    public void index_jsp(Model model){  
        model.addAttribute("liming", "ÀèÃ÷");  
        System.out.println("index.jsp");   
    } 
}
