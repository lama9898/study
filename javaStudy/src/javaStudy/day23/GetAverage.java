package javaStudy.day23;

import java.util.Arrays;

public class GetAverage {
	public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		for (int a : arr) {
			sum += a;
		}
		answer = (double) sum / arr.length;
		return answer;
	}
	
	public int otherSolution(int[] array) {
	      return (int) Arrays.stream(array).average().orElse(0);
	    }
}
