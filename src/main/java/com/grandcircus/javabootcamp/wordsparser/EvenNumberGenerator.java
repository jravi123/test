package com.grandcircus.javabootcamp.wordsparser;

import java.util.ArrayList;
import java.util.List;

public class EvenNumberGenerator {

	public List<Integer> getEvenNumbers(int i) {

		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (int j = 0; j <= i; j++) {
			if (j % 2 == 0) {
				evenNumbers.add(j);
			}
		}
		return evenNumbers;
	}

}
