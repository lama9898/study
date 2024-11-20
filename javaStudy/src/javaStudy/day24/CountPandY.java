package javaStudy.day24;

public class CountPandY {
	boolean solution(String s) {
		boolean answer = true;
		int p = 0, y = 0;
		for (char c : s.toCharArray()) {
			if (c == 'p' || c == 'P') {
				p++;
			} else if (c == 'y' || c == 'Y') {
				y++;
			}
		}
		answer = p == y ? true : false;

		return answer;
	}
	//모두 uppercase/lowercase로 변환해서 한번에 count하는 방법도 잇음
}
