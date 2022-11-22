package com.example.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number1}/and/{number2}")
    @ResponseBody
    public int add(@PathVariable int number1, @PathVariable int number2 ) {
        return number1 + number2;
    }

    @GetMapping("/subtract/{number1}/from/{number2}")
    @ResponseBody
    public int subtract(@PathVariable int number1, @PathVariable int number2 ) {
        return number1 - number2;
    }

    @GetMapping("/multiply/{number1}/and/{number2}")
    @ResponseBody
    public int multiply(@PathVariable int number1, @PathVariable int number2 ) {
        return number1 * number2;
    }

    @GetMapping("/divide/{number1}/by/{number2}")
    @ResponseBody
    public int divide(@PathVariable int number1, @PathVariable int number2 ) {
        return number1 / number2;
    }

    // TODO: Create a get mapping to /roll-dice to show anchor tag options

    @GetMapping("/roll-dice")
    public String choices(){
        return "number";
    }

    @GetMapping("/roll-dice/{num}")
    // Use Path Variable
    public String guessNumber(@PathVariable int num) {

        // TODO: Create a variable that will store a random number between 1-6
        int guessNumber = (int)Math.floor(Math.random()*6+1);

        // TODO: Create a conditinal statement to check if the path variable and the random number match.
        if(num == guessNumber){
            return "rightGuess";
        }else{
            if ( num != guessNumber  )
            return "wrongGuess";
        }
        // TODO: Finally, pass a boolean to the number template to inform the user if they were correct or not.

//
        return null;
    }
}
