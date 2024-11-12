package javaStudy.day17;

public class ChangeToLs_06 {
	public String mySolution(String myString) {
		String answer = "";
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) < 'l') {
				answer += 'l';
			} else {
				answer += myString.charAt(i);
			}
		}
		return answer;
	}

	public String otherSolution(String myString) {
		return myString.replaceAll("[^l-z]", "l");
	}
}
