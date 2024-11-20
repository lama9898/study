package javaStudy.day23;

public class AddingTheHidingNumbers01 {
	public int solution(String my_string) {
		int answer = 0;
		String temp = my_string.replaceAll("[a-zA-Z]", "");
		//String str = my_string.replaceAll("[^0-9]","");
		for (int i = 0; i < temp.length(); i++) {
			answer = answer + (temp.charAt(i) - '0');
			//answer += Character.getNumericValue(ch);
		}

		return answer;
	}
}
