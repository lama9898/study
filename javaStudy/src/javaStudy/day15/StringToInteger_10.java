package javaStudy.day15;

public class StringToInteger_10 {
	public int mySolution(String n_str) {
		int answer = Integer.parseInt(n_str);
		return answer;
	}

	public int otherSolution(String n_str) {
		int answer = 0;
		for (int i = 0; i < n_str.length(); i++) {
			answer = answer * 10;
			answer += n_str.charAt(i) - 48;
		}
		return answer;
	}
}
