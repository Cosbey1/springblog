package com.example.springblog.Controllers;

import com.example.springblog.Post;
import com.example.springblog.Repositories.PostRepository;
import com.example.springblog.Repositories.UserRepository;
import com.example.springblog.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
    private final PostRepository postDao;
    private final UserRepository userDao;

    public PostController(PostRepository postDao, UserRepository userDao) {
        this.postDao = postDao;
        this.userDao = userDao;
    }


    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("posts/{id}")
    public String individual(@PathVariable long id, Model model) {
        model.addAttribute("posts",postDao.getReferenceById(id));
        return "posts/show";
    }

    @GetMapping("posts/create")
    public String create() {

        return "posts/create";
    }

    @PostMapping("posts/create")
    public String post(@RequestParam(name = "title") String title, @RequestParam(name = "body") String body) {
        Post post = new Post(title, body);
        post.setUser((User) userDao.getReferenceById(1L));
        postDao.save(post);
        return "redirect:/posts";
    }


}

