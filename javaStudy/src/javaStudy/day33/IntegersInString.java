package javaStudy.day33;

public class IntegersInString {
	public static void main(String[] args) {
		IntegersInString test = new IntegersInString();
		test.solution("2three45sixseven");
	}

	public int solution(String s) {
		int answer = 0;
		String num = "";
		int i = 0;
		while (i < s.length()) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c)) {
				String word = s.substring(i, i + 2);

				if (word.equals("ze")) {
					c = '0';
					i = i + 4;
				} else if (word.equals("on")) {
					c = '1';
					i = i + 3;
				} else if (word.equals("tw")) {
					c = '2';
					i = i + 3;
				} else if (word.equals("th")) {
					c = '3';
					i = i + 5;
				} else if (word.equals("fo")) {
					c = '4';
					i = i + 4;
				} else if (word.equals("fi")) {
					c = '5';
					i = i + 4;
				} else if (word.equals("si")) {
					c = '6';
					i = i + 3;
				} else if (word.equals("se")) {
					c = '7';
					i = i + 5;
				} else if (word.equals("ei")) {
					c = '8';
					i = i + 5;
				} else if (word.equals("ni")) {
					c = '9';
					i = i + 4;
				}

				num += c;
			} else {
				num += c;
				i++;
			}
		}
		answer = Integer.parseInt(num);
		return answer;
	}

	public int otherSolution01(String s) {
		String[] strArr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		for (int i = 0; i < strArr.length; i++) {
			s = s.replaceAll(strArr[i], Integer.toString(i));
		}
		return Integer.parseInt(s);
	}

	public int otherSolution02(String s) {
		int answer = 0;
		StringBuilder sb = new StringBuilder("");
		int len = s.length();
		String[] digits = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String[] alphabets = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < 10; i++) {
			s = s.replaceAll(alphabets[i], digits[i]);
		}
		answer = Integer.parseInt(s);

		return answer;
	}
}
