package javaStudy.day24;

import java.util.Arrays;

public class HowToMakeTriangle01 {
	public int solution(int[] sides) {
		int answer = 0;
		Arrays.sort(sides);
		answer = sides[0] + sides[1] > sides[2] ? 1 : 2;
		return answer;
	}
}
