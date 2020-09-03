package com.cg.dcw.test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;

import org.springframework.test.context.junit4.SpringRunner;

import com.carwash.controller.CarController;

@RunWith(SpringRunner.class)
public class DCWTest {
	
	public static final String SUCCESS="success";
	
	@InjectMocks
	CarController carController;
	

	@Test
	public void helloworld() {
		assertEquals("Hello World!", carController.helloWorld());
	}
}
