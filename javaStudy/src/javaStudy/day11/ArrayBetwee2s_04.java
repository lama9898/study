package javaStudy.day11;

import java.util.Arrays;

public class ArrayBetwee2s_04 {
	public static void main(String[] args) {
		int[] temp = { 1, 2, 1, 2, 1, 10, 2, 1 };
		ArrayBetwee2s_04 test = new ArrayBetwee2s_04();
		System.out.println(test.mySolution(temp)[0]);
//		String afterregex = Arrays.toString(temp).replaceAll("[,\\s\\[\\]]", "");
//		System.out.println(afterregex.indexOf('2'));

	}

	public int[] mySolution(int[] arr) {
		// 2의 첫 인덱스, 2의 마지막 인덱스로 배열 생성
		// 없으면 return [-1]
		// 같으면 [해당 인덱스]
		// 다르면 그대로
		int[] answer = {};
		int start = -1, end = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (start == -1) {
					start = i;
				}
				end = i;
			}
		}
		if (start == -1) {
			answer = new int[1];
			answer[0] = -1;
		} else if (start == end) {
			answer = new int[1];
			answer[0] = arr[end];
		} else {
			answer = new int[end - start + 1];
			for (int i = start; i <= end; i++) {
				answer[i - start] = arr[i];
			}
		}

		return answer;
	}

	public int[] otherSolution(int[] arr) {
		int firstIndex = -1;
		int lastIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 2) {
				if (firstIndex == -1) {
					firstIndex = i;
				}
				lastIndex = i;
			}
		}
		if (firstIndex == -1) {
			return new int[] { -1 };
		}
		int[] answer = Arrays.copyOfRange(arr, firstIndex, lastIndex + 1);
		return answer;
	}
}
