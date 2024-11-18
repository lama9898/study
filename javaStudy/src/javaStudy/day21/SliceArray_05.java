package javaStudy.day21;

import java.util.Arrays;

public class SliceArray_05 {
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		int idx = 0;
		for (int i = num1; i <= num2; i++) {
			answer[idx] = numbers[i];
			idx++; //answer[i -num1] = numbers[i];
		}
		return answer;
	}
	public int[] otherSolution(int[] numbers, int num1, int num2) {
        return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
