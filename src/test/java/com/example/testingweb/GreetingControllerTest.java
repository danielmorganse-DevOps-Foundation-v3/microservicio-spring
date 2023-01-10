package com.example.testingweb;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(GreetingController.class)
class GreetingControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    GreetingService greetingService;
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        Mockito.when(greetingService.greet()).thenReturn("Finaliza el curso DevOps Foundation v3");
        this.mockMvc.perform(get("/greeting")).andDo(print()).andExpect(status().isOk())
              .andExpect(content().string(containsString("Finaliza el curso DevOps Foundation v3")));
    }

}