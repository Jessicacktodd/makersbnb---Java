package com.makers.makersbnb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StaticPageController {
    @GetMapping("/")
    public String landingPage() {
        return "Welcome to MakersBnB";
    }

    @GetMapping("/contactus")
    public String contactUs() {
        return "Jess@Jess.com";
    }

    @GetMapping("/team")
    public String team() {
        return "Toby, Katerina, Sandy";
    }
}
