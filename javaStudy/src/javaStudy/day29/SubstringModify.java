package javaStudy.day29;

public class SubstringModify {
	public static void main(String[] args) {
		SubstringModify test = new SubstringModify();
		test.solution("500220839878", "7");
	}

	public int solution(String t, String p) {
		int answer = 0;
		long pn = Long.parseLong(p);
		for (int i = 0; i < t.length() - p.length() + 1; i++) {
			String tsub = t.substring(i, i + p.length());
			long tn = Long.parseLong(tsub);
			if (tn <= pn) {
				answer++;
			}
		}
		return answer;
	}
}
