package com.education;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @RequestMapping("/some")
    public String index(){
        return "index";
    }
}
