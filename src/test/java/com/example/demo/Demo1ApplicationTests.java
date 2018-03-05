package com.example.demo;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.example.demo.controller.StudentController;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Demo1Application.class)
@ActiveProfiles("test")
public class Demo1ApplicationTests {
	@InjectMocks
	StudentController controller;

	@Autowired
	WebApplicationContext context;

	private MockMvc mvc;
	
	@Before
    public void initTests() {
        MockitoAnnotations.initMocks(this);
        mvc = MockMvcBuilders.webAppContextSetup(context).build();
    }


}
