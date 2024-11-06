package javaStudy.day13;

public class ToLowerOrUpperCase_03 {
	public String[] solution(String[] strArr) {
		String[] answer = strArr.clone();
		for (int i = 0; i < strArr.length; i++) {
			if (i % 2 == 1) {
				// 대문자로
				answer[i] = answer[i].toUpperCase();
			} else {
				// 소문자로
				answer[i] = answer[i].toLowerCase();
			}
		}
		return answer;
	}

	public String[] otherSolution(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			strArr[i] = i % 2 == 0 ? strArr[i].toLowerCase() : strArr[i].toUpperCase();
		}
		return strArr;
	}
}
