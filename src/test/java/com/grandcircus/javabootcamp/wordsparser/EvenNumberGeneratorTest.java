package com.grandcircus.javabootcamp.wordsparser;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EvenNumberGeneratorTest  {
	
	private EvenNumberGenerator gen = null;
	
	@Before
	public void initialize(){
		 gen = new EvenNumberGenerator();
	}

	@Test
	public void shouldReturnZeroForZeroInput() throws Exception {
		assertValues(0,0);
	}
	
	@Test
	public void shouldReturnZeroForNumberOneInput() throws Exception {
		assertValues(1,0);
	}
	
	@Test
	public void shouldReturn0And2WhenTheInputIs2() throws Exception {
		assertValues(2,0,2);
	}
	
	private <T> void assertValues(int inputNumber, T...  expected){
		List<Integer> actual = gen.getEvenNumbers(inputNumber);
		assertEquals(Arrays.asList(expected), actual);
	}


}
