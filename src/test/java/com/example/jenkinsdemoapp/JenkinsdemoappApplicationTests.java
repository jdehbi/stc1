package com.example.jenkinsdemoapp;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.example.jenkinsdemoapp.controllers.TestController;


@SpringBootTest(classes = JenkinsdemoappApplication.class)
class JenkinsdemoappApplicationTests {

	@InjectMocks
	TestController testController;

	@Test
	public void getcontact() throws Exception {
		MockHttpServletRequest request = new MockHttpServletRequest();
		RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));

		ResponseEntity<String> responseEntity = testController.getContactInfo();
		assertThat(responseEntity.getStatusCodeValue()).isEqualTo(200);

	}

}