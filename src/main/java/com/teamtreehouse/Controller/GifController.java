package com.teamtreehouse.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GifController {
    @RequestMapping( "/")
    public String listGifs(){
        return "home";
    }
//    @RequestMapping( "/gifs")
//    @ResponseBody
//    public String helloWorld(){
//        return "Hello World!";
//    }
}

