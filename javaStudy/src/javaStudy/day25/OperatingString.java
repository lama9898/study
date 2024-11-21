package javaStudy.day25;

public class OperatingString {
	public int solution(String my_string) {
		int answer = 0;
		String[] math = my_string.split(" ");
		int operator = 0; // 0:시작, 1:+, -1:-
		for (String m : math) {
			if (m.equals("+")) {
				operator = 1;
			}
			else if (m.equals("-")) {
				operator = -1;
			}
			else {
				if (operator == 1) {
					answer += Integer.parseInt(m);
				}
				else if (operator == -1) {
					answer -= Integer.parseInt(m);
				}
				else {
					answer = Integer.parseInt(m);
				}
			}
		}
		return answer;
	}
}
