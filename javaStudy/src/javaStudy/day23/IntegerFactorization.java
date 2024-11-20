package javaStudy.day23;

import java.util.ArrayList;

public class IntegerFactorization {
	// 소인수분해
	public int[] solution(int n) {
		ArrayList<Integer> answer = new ArrayList<>();
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				boolean temp = true;
				for (Integer a : answer) {
					if (i % a == 0) {
						temp = false;
						break;
					}
				}
				if (temp) {
					answer.add(i);
				}
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	//hash 사용하여 풀기
}
