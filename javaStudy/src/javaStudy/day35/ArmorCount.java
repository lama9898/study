package javaStudy.day35;

import java.util.HashMap;

public class ArmorCount {

	public int solution(int number, int limit, int power) {
		int answer = 0;
		HashMap<Integer, Integer> dev = new HashMap<>();
		for (int i = 1; i <= number; i++) {
			dev.put(i, 1);
			for (int j = 2; j <= i; j++) {
				if (i % j == 0)
					dev.put(i, dev.get(i) + 1);
			}
			answer = dev.get(i) > limit ? answer + power : answer + dev.get(i);
		}
		return answer;
	} // 시간초과

	public int shorterSolution(int number, int limit, int power) {
		int answer = 0;
		int div = 0;
		for (int i = 1; i <= number; i++) {
			div = 0;
			for (int j = 1; j * j <= i; j++) {
				if (j * j == i)
					div++;
				else if (i % j == 0)
					div += 2;
			}
			answer = div > limit ? answer + power : answer + div;
		}
		return answer;
	}

}
