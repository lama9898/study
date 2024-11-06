package javaStudy.day13;

import java.util.ArrayList;

public class DivideBySpace02_10 {
	public String[] mySolution(String my_string) {
		ArrayList<String> answer = new ArrayList<String>();
		String trimStr = my_string.trim();
		boolean blankBefore = true;
		int idx = -1;
		for (int i = 0; i < trimStr.length(); i++) {
			if (trimStr.charAt(i) != ' ') { // 공백아닐때만
				if (blankBefore) { // 띄어쓰기 O = 새로운 단어
					answer.add(trimStr.charAt(i) + "");
					idx++;
				} else {
					answer.set(idx, answer.get(idx) + trimStr.charAt(i));
				}
				blankBefore = false;
			} else {
				blankBefore = true;
			}
		}
		return answer.toArray(new String[0]);
	}

	public String[] otherSolution(String my_string) {
		return my_string.trim().split("[ ]+");
	}
}
