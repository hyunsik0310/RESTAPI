package com.example.restfulwebservice.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	//GET방식
	// /hello-world(endpoint)
	//@RequestMapping(method = RequestMethod.Get, path="/hello-world")
	
	@GetMapping(path = "/hello-world")
	public String hellowWorld() {
		
		return "Hello World";
	}
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean hellowWorldBean() {
		
		return new HelloWorldBean("hello world");
	}
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean hellowWorldBean(@PathVariable String name) {
		
		return new HelloWorldBean(String.format("hello world, %s" , name));
	}
	
}
