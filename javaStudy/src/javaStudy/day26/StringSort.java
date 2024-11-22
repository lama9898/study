package javaStudy.day26;

import java.util.Arrays;

public class StringSort {
	public String solution(String s) {
		String answer = "";
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		for (int i = 0; i < s.length(); i++) {
			answer = arr[i] + answer;
		}
		return answer;
		//return new StringBuilder(new String(sol)).reverse().toString();
	}
}
