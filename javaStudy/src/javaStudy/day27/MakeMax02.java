package javaStudy.day27;

import java.util.Arrays;

public class MakeMax02 {
	public int solution(int[] numbers) {
		int answer = 0;
		Arrays.sort(numbers);
		answer = numbers[0] * numbers[1] > numbers[numbers.length - 1] * numbers[numbers.length - 2]
				? numbers[0] * numbers[1]
				: numbers[numbers.length - 1] * numbers[numbers.length - 2];
		return answer;
	}
}
