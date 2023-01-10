package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

	private final GreetingService greetService;

	public GreetingController(GreetingService service) {
		this.greetService = service;
	}

	@RequestMapping("/greeting")
	public @ResponseBody String greeting() {
		return this.greetService.greet();
	}

}
