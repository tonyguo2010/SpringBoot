package com.seakie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	String home(String name) {
		if (name != null) {
			return "Hello, " + name;
		} else {
			return "Please input URL like http://localhost:8080/?name=Someone";
		}
	}
	
}
