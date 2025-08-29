package com.ankit.error;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//("/")
public class MyErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError() {
        // You can add more sophisticated logic here based on error attributes
        return "Oops! Something went wrong.";
    }

    // For Spring Boot 2.3+ you might need to override getErrorPath() or just rely on @RequestMapping("/error")
    // @Override
    // public String getErrorPath() {
    //    return "/error";
    // }
}