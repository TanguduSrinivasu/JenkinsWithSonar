package com.example.sonarwithjunit.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = { MyTest1.class })

public class MyTest {

	@Test
	public void run1() {

	}
	
	@Test
	public void run2() {

	}
	
	@Test
	public void run3() {

	}
}
