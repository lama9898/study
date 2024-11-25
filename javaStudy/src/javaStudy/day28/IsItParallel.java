package javaStudy.day28;

public class IsItParallel {
	public int solution(int[][] dots) {
		int answer = 0;
		// 1,2 - 3,4
		double dx1 = dots[1][0] - dots[0][0];
		double dy1 = dots[1][1] - dots[0][1];

		double dx2 = dots[3][0] - dots[2][0];
		double dy2 = dots[3][1] - dots[2][1];

		if (dy1 / dx1 == dy2 / dx2) {
			answer = 1;
		}

		// 1,3 - 2,4

		dx1 = dots[2][0] - dots[0][0];
		dy1 = dots[2][1] - dots[0][1];

		dx2 = dots[3][0] - dots[1][0];
		dy2 = dots[3][1] - dots[1][1];

		if (dy1 / dx1 == dy2 / dx2) {
			answer = 1;
		}

		// 1,4 - 2,3

		dx1 = dots[3][0] - dots[0][0];
		dy1 = dots[3][1] - dots[0][1];

		dx2 = dots[2][0] - dots[1][0];
		dy2 = dots[2][1] - dots[1][1];

		if (dy1 / dx1 == dy2 / dx2) {
			answer = 1;
		}

		return answer;
	}
	
	
}
