package com.aronno.spring_estore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping("/")
    public String index() {
        logger.info("Accessing home page");
        return "index.html";
    }

    @GetMapping("/login")
    public String login() {
        logger.info("Accessing login page");
        return "login.html";
    }

    @GetMapping("/register")
    public String register() {
        logger.info("Accessing register page");
        return "register.html";
    }

    @PostMapping("/login")
    public String loginUser(@RequestParam String username, @RequestParam String password) {
        logger.info("Logging in user: {}", username);
        // Implement user login logic here
        return "redirect:/";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String email, @RequestParam String fullName) {
        logger.info("Registering user: {}, email: {}, full name: {}", username, email, fullName);
        // Implement user registration logic here
        return "redirect:/";
    }

    @GetMapping("/products")
    public String viewProducts(@RequestParam(required = false) String category) {
        logger.info("Viewing products, category: {}", category);
        // Implement logic to display products based on category
        return "products.html";
    }
}
