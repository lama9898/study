package javaStudy.day26;

public class FindNumInString {
	public int solution(int num, int k) {
		int answer = 0;
		String numS = num + "";
		answer = numS.contains(k + "") ? numS.indexOf(k + "") + 1 : -1;
		return answer;
	}
}
