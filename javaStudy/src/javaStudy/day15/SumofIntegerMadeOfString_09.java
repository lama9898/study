package javaStudy.day15;

public class SumofIntegerMadeOfString_09 {
	public int mySolution(String num_str) {
		int answer = 0;
		for (int i = 0; i < num_str.length(); i++) {
			answer += (int) num_str.charAt(i) - (int) '0';
		}
		return answer;
	}
	
	public int otherSolution(String numStr) {
        return numStr.chars().map(c -> c - 48).sum();
    }
}
