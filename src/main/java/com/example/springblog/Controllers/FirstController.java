package com.example.springblog.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class FirstController {

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Hello From Spring!";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/bubbles")
    @ResponseBody String bubbles() {
        return "stop blowing bubbles...";
    }

    @GetMapping("greeting/{name}")
    @ResponseBody
    public String greeting(@PathVariable String name) {
        return "Greetings " + name;
    }
}


