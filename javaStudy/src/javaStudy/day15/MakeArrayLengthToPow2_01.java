package javaStudy.day15;

import java.util.Arrays;

public class MakeArrayLengthToPow2_01 {
	public int[] mySolution(int[] arr) {
		int[] answer = {};
		int length = 1;
		while (arr.length <= length) {
			length = length * 2;
		}
		answer = new int[length];
		for (int i = 0; i < arr.length; i++) {
			answer[i] = arr[i];
		}
		return answer;
	}

	public int[] otherSolution(int[] arr) {
		int length = 1;

		while (length < arr.length) {
			length *= 2;
		}

		return Arrays.copyOf(arr, length);
	}
}
