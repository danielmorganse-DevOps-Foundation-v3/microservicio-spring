package com.example.testingweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	private final GreetingService greetService;

	public HomeController(GreetingService greetService) {
		this.greetService = greetService;
	}
	@RequestMapping(value = "/", method = {RequestMethod.GET})
	public @ResponseBody String greeting()  { return this.greetService.greet(); }

}
