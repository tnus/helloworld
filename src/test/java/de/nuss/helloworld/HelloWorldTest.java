package de.nuss.helloworld;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private HelloWorld helloWorld;

	@Before
	public void setUp() throws Exception {
		helloWorld = new HelloWorld();
	}

	@Test
	public void test() {
		String result = helloWorld.sayHello();
		assertEquals("Hello World!", result);
	}

}
