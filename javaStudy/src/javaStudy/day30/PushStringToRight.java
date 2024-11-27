package javaStudy.day30;

public class PushStringToRight {
	public int solution(String A, String B) {
		int answer = -1;
		String a = A;
		if (A.equals(B))
			return 0;
		for (int i = 1; i < A.length(); i++) {
			a = A.substring(A.length() - i) + A.substring(0, A.length() - i);
			if (a.equals(B)) {
				answer = i;
				break;
			}
		}
		return answer;
	}

	public int otherSolution(String A, String B) {
		String tempB = B.repeat(3);
		return tempB.indexOf(A);
	}
}
