package io.springboot.javacourse.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
 
	@RequestMapping("/hello") //only works with get request 
	public String sayHi() {
		return "hi";
	}
}
