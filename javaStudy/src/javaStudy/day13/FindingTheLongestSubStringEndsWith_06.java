package javaStudy.day13;

public class FindingTheLongestSubStringEndsWith_06 {
	public String mySolution(String myString, String pat) {
		String answer = myString.substring(0, myString.lastIndexOf(pat) + pat.length());
		return answer;
	}

	public String otherSolution(String myString, String pat) {
		String answer = "";
		int idx = myString.lastIndexOf(pat);
		answer = myString.substring(0, idx) + pat;
		return answer;
	}
}
