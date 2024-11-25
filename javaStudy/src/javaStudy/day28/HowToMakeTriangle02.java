package javaStudy.day28;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HowToMakeTriangle02 {
	public int solution(int[] sides) {
		int answer = 0;
		Set<Integer> possible = new HashSet<>();
		Arrays.sort(sides);

		// sides중 큰 수가 가장 긴 변인 경우
		int x = sides[1] - sides[0] + 1;
		while (true) {
			possible.add(x);
			x++;
			if (x > sides[1])
				break;
		}

		// 제3의 수가 가장 긴 변인 경우
		x = sides[1];
		while (true) {
			if (sides[0] + sides[1] > x) {
				possible.add(x);
			}
			x++;
			if (x > sides[0] + sides[1])
				break;
		}
		answer = possible.size();

		return answer;
	}

	public int otherSolution(int[] sides) {
		int answer = 0;
		Arrays.sort(sides);
		answer = sides[0] * 2 - 1;

		return answer;
	}
}
