package javaStudy.day26;

import java.util.Arrays;

public class PickNumberFromArray {
	public int[] solution(int n, int[] numlist) {
		int[] answer = Arrays.stream(numlist).filter(x -> x % n == 0).toArray();
		return answer;
	}
}
