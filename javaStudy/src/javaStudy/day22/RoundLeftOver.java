package javaStudy.day22;

public class RoundLeftOver {
	public int solution(int[] numbers, int k) {
		int answer = 0;
		int thrower = 0;
		for (int i = 1; i < k; i++) {
			thrower = thrower + 2;
		}
		answer = numbers[thrower % numbers.length];
		return answer;
	}
	
	public int otherSolution(int[] numbers, int k) {
        return (k-1)*2 % numbers.length+1;
    }
}
