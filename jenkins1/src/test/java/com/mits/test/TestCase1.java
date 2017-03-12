package com.mits.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mits.samples.HelloWorld;

public class TestCase1 {

	@Test
	public void test() {
		HelloWorld obj = new HelloWorld();
		//obj.getResults();
		assertEquals(6, obj.getResults());
	}

}
