package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String posts() {
        return "post goes here";
    }

    @GetMapping("posts/{id}")
    @ResponseBody
    public String individual(@PathVariable String id){
        return "here is " + id + "'s individual post";
    }

    @GetMapping("posts/create")
    @ResponseBody
    public String create() {
        return "here is a form to create a post";
    }

    @PostMapping("posts/create")
    @ResponseBody
    public String post(){
        return "you created a post";
    }

}
