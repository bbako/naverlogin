package org.bbako.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@GetMapping
	public void indexGet(){
		
		
	}
	
	@GetMapping("/callback")
	public void callbackPost(){
		
		
	}

}
