package javaStudy.day26;

import java.util.Arrays;

public class SortAndToLowerCaseString {
	public String solution(String my_string) {
		String answer = "";
		char[] arr = my_string.toLowerCase().toCharArray();
		Arrays.sort(arr);
		answer = String.valueOf(arr);
		return answer;
	}
}
