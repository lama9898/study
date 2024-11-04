package javaStudy.day11;

import java.util.Arrays;

public class LeftRight_08 {
	public String[] mySolution(String[] str_list) {
		String[] answer = {};
		int l = -1, r = -1;
		for (int i = 0; i < str_list.length; i++) {
			if (str_list[i].equals("l")) { // 0 1 2 3 4
				l = i; // if i = 2, answer는 0,1, str_list.length : 5, i=2 = 3
				break;
			} else if (str_list[i].equals("r")) {
				r = i;
				break;
			}
		}
		if (l != -1) {
			answer = new String[l];
			answer = Arrays.copyOfRange(str_list, 0, l);
		} else if (r != -1) {
			answer = new String[str_list.length - r];
			answer = Arrays.copyOfRange(str_list, r + 1, str_list.length);
		}
		return answer;
	}

	public String[] otherSolution(String[] str_list) {
		String[] answer = {};
		for (int i = 0; i < str_list.length; i++) {
			if ("l".equals(str_list[i])) {
				answer = Arrays.copyOfRange(str_list, 0, i);
			} else if ("r".equals(str_list[i])) {
				answer = Arrays.copyOfRange(str_list, i + 1, str_list.length);
			}
		}
		return answer;
	}
}
