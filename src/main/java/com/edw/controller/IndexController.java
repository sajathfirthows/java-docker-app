package com.edw.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @GetMapping("/api/data")
    public HashMap<String, Object> getData() {
        logger.debug("request served");

        HashMap<String, Object> response = new HashMap<>();
        response.put("success", true);
        response.put("hello", "world");
        response.put("new-message", "adding a new msg");

        return response;
    }

    @RequestMapping("/")
    public String index() {
        return "index"; // This will serve the Thymeleaf template named index.html
    }
}
