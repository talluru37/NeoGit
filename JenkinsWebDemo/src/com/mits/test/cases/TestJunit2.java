package com.mits.test.cases;

import com.mits.test.HelloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestJunit2 {
	
	// test method to add two values
		@Test
	   public void testAdd1(){
	      HelloWorld obj = new HelloWorld();
	     int result= obj.getResults(3, 5);
	     assertEquals(result, 6);
	   }

}
