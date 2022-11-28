package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostRepository postDao;
    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

//    @GetMapping("/posts")
//    @ResponseBody
//    public String posts() {
//        return "post goes here";
//    }

    @GetMapping("/posts")
    public String posts(Model model) {
       model.addAttribute("posts",postDao.findAll());
        return "posts/index";
    }


//    @GetMapping("posts/{id}")
//    @ResponseBody
//    public String individual(@PathVariable String id){
//        return "here is " + id + "'s individual post";
//    }

    @GetMapping("posts/{id}")
    public String individual(@PathVariable String id){

        return "posts/show";
    }

    @GetMapping("posts/create")
    public String create() {

        return "posts/create";
    }

    @PostMapping("posts/create")
    public String post(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body){
        Post post = new Post(title, body);
        postDao.save(post);
        return "redirect:/posts";
    }


}
