package javaStudy.day32;

import java.util.HashMap;

public class ClosestWord {
	public int[] solution(String s) {
		int[] answer = new int[s.length()];
		HashMap<Character, Integer> check = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (check.containsKey(s.charAt(i))) {
				answer[i] = i - check.get(s.charAt(i));
				check.put(s.charAt(i), i);
			}
			else {
				answer[i] = -1;
				check.put(s.charAt(i), i);
			}
		}
		return answer;
	}
}
