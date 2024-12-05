package javaStudy.day33;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringByIndexAndCompareTo {
	public String[] solution(String[] strings, int n) {
		String[] answer = strings.clone();
		for (int i = 0; i < answer.length - 1; i++) {
			for (int j = i + 1; j < answer.length; j++) {
				String temp = "";
				if (answer[i].charAt(n) > answer[j].charAt(n)) {
					temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
				else if (answer[i].charAt(n) == answer[j].charAt(n)) {
					if (answer[i].compareTo(answer[j]) > 0) {
						temp = answer[i];
						answer[i] = answer[j];
						answer[j] = temp;
					}
				}
			}
		}
		return answer;
	}
	
	public String[] otherSolution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
}
