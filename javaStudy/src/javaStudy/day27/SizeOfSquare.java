package javaStudy.day27;

public class SizeOfSquare {
	public int solution(int[][] dots) {
		int answer = 0;
		int width = 0, height = 0;
		
		if (dots[0][0] - dots[1][0] != 0) {
			width = Math.abs(dots[0][0] - dots[1][0]);
		}
		else {
			width = Math.abs(dots[0][0] - dots[2][0]);
		}
		
		if (dots[0][1] - dots[1][1] != 0) {
			height = Math.abs(dots[0][1] - dots[1][1]);
		}
		else {
			height = Math.abs(dots[0][1] - dots[2][1]);
		}
		
		answer = width * height;
		return answer;
    }
	
	public int otherSolution(int[][] dots) {
		int x = Math.max(Math.abs(dots[0][0] - dots[1][0]), Math.abs(dots[0][0] - dots[2][0]));
		int y = Math.max(Math.abs(dots[0][1] - dots[1][1]), Math.abs(dots[0][1] - dots[2][1]));
		return x * y;
    }
}
