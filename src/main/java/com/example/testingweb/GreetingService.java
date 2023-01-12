package com.example.testingweb;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	private static final String COMMON_GREET = "Finaliza el curso DevOps Foundation v3 - Daniel Morgan";
	public String greet() {
		return COMMON_GREET;
	}
}
