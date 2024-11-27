package javaStudy.day30;

import java.util.Arrays;

public class CompareStringWithSwapString {
	public int solution(String before, String after) {
		int answer = 1;
		char[] arr1 = before.toCharArray();
		char[] arr2 = after.toCharArray();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr2[j] = '0';
					break;
				}
			}
		}
		for (char a : arr2) {
			if (a != '0') {
				answer = 0;
				break;
			}
		}
		return answer;
	}

	public int otherSolution(String before, String after) {
		char[] a = before.toCharArray();
		char[] b = after.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);

		return new String(a).equals(new String(b)) ? 1 : 0;
	}
}
