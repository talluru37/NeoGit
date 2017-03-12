package com.mits.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mits.samples.HelloWorld;

public class TestCase2 {

	@Test
	public void test() {
		HelloWorld obj = new HelloWorld();
		//obj.getResults();
		assertEquals(7, obj.getResults());
	}

}
