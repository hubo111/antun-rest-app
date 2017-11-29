package com.hblg.bigdata.autun.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/yy/")
public class HelloController {

	@RequestMapping("/hello")
	public String hello(){
		
		return "hello";
	}
	
}
