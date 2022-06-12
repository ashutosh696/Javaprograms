package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.controller.ActionController;
import com.example.demo.service.ActionService;

@WebMvcTest(value=ActionController.class)
public class ActionControllerTest {

@MockBean	
private ActionService actionService;	

@Autowired
MockMvc mockMvc;
	
@Test
public void testAction() throws Exception {
	
	when(actionService.getAction()).thenReturn("Keep Calm !!..");
	
	MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/unit/test");
	
	ResultActions perform = mockMvc.perform(requestBuilder);
	
	MvcResult mvcResult = perform.andReturn();
	
	MockHttpServletResponse response = mvcResult.getResponse();
	
	int status = response.getStatus();
	
	assertEquals(200, status);
	
	
}
}
