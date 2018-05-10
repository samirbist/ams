package com.ams.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	
	
	 @RequestMapping("/")
	    public String welcome() {//Welcome page, non-rest
	        return "Welcome to RestTemplate Example.";
	    }

}
