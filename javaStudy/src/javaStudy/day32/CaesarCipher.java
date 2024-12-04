package javaStudy.day32;

public class CaesarCipher {
	public static void main(String[] args) {
		CaesarCipher test = new CaesarCipher();
		test.solution("a B z", 354);
	}
	
	public String solution(String s, int n) {
		String answer = "";
		for (char c : s.toCharArray()) {
			if (Character.isUpperCase(c)) {
				answer = answer + (char) ('A' + (c - 'A' + n) % 26);
			}
			else if (Character.isLowerCase(c)) {
				answer = answer + (char) ('a' + (c - 'a' + n) % 26);
			}
			else {
				answer += c;
			}

		}
		return answer;
	}
	
	public String ohterSolution(String s, int _n) {
		return s.chars().map(c -> {
			int n = _n % 26;
			if (c >= 'a' && c <= 'z') {
				return 'a' + (c - 'a' + n) % 26;
			} else if (c >= 'A' && c <= 'Z') {
				return 'A' + (c - 'A' + n) % 26;
			} else {
				return c;
			}
		}).mapToObj(c -> String.valueOf((char) c)).reduce((a, b) -> a + b).orElse("");
	}
}
