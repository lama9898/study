package javaStudy.day31;

public class SpaceUpperLower {
	
	/*
		문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
		
		각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
	*/

	public String solution(String s) {
		String answer = "";
		int idx = 0;
		for (char c : s.toCharArray()) {
			char temp = c;
			if (c != ' ') {
				idx++;
			}
			else {
				idx = 0;
			}

			if (idx != 0 && idx % 2 == 1 && c >= 'a') {
				temp = (char) (c - ('a' - 'A'));
			}
			else if (idx != 0 && idx % 2 == 0 && c <= 'Z') {
				temp = (char) (c + ('a' - 'A'));
			}
			answer += temp;
		}
		return answer;
	}
	
	public String otherSolution(String s) {

		String answer = "";
		int cnt = 0;
		String[] array = s.split("");

		for (String ss : array) {
			cnt = ss.contains(" ") ? 0 : cnt + 1;
			answer += cnt % 2 == 0 ? ss.toLowerCase() : ss.toUpperCase();
		}
		return answer;
	}
}
