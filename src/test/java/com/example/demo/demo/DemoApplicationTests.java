package com.example.demo.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	String a = "hello world";

	@Test
	void contextLoads() {
		String b = "hello world";
		assert.equals(1,1);
	}

}
