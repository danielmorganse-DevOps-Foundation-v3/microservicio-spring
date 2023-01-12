package com.example.testingweb;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.ResponseBody;

@WebMvcTest(HomeController.class)
//tag::test[]
public class WebLayerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	GreetingService greetingService;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		Mockito.when(greetingService.greet()).thenReturn("Finaliza el curso DevOps Foundation v3 - Daniel Morgan");
		this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
				.andExpect(content().string(containsString("Finaliza el curso DevOps Foundation v3 - Daniel Morgan")));
	}
}
//end::test[]
