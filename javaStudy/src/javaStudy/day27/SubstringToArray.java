package javaStudy.day27;

public class SubstringToArray {
	public String[] solution(String my_str, int n) {
		int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
		String[] answer = new String[length];
		int idx = 0;
		for (int i = 0; i < answer.length; i++) {
			if ((i + 1) * n > my_str.length()) {
				answer[i] = my_str.substring(i * n, my_str.length());
			}
			else {
				answer[i] = my_str.substring(i * n, (i + 1) * n);
			}
		}
		return answer;
    }
	
	public String[] otherSolution(String my_str, int n) {
		int resultCnt = (my_str.length() + n - 1) / n;
		String[] answer = new String[resultCnt];

		for (int i = 0; i < resultCnt; i++) {
			int start = n * i;
			int end = start + n >= my_str.length() ? my_str.length() : start + n;
			answer[i] = my_str.substring(start, end);
		}

		return answer;
	}
}
