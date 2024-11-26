package javaStudy.day29;

public class Babbling {
	public static void main(String[] args) {
		Babbling test = new Babbling();
		String[] arr = { "aya", "yee", "u", "maa", "wyeoo" };
		test.solution(arr);
	}

	public int solution(String[] babbling) {
		int answer = 0;
		String[] able = { "aya", "ye", "woo", "ma" };

		for (String babble : babbling) {
			String temp = babble.replace("aya", " ").replace("ye", " ").replace("woo", " ").replace("ma", " ");
			if (temp.trim().isBlank())
				answer++;
		}
		return answer;
	}
}
