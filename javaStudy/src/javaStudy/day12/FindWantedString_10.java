package javaStudy.day12;

public class FindWantedString_10 {
	public int solution(String myString, String pat) {
		int answer = myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
		return answer;
	}
}
