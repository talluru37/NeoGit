package com.mits.test.cases;

import com.mits.test.HelloWorld;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaTest {
	   protected int value1, value2;
	   
	   @Test
	   public void testAdd1(){
	      HelloWorld obj = new HelloWorld();
	     int result= obj.getResults(3, 5);
	     assertEquals(result, 8);
	   }
}