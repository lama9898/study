package javaStudy.day28;

public class SafeZone {
	public int solution(int[][] board) {
		int answer = 0;
		int[][] safezone = new int[board.length + 2][board.length + 2];
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == 1) {
					for (int a = -1; a <= 1; a++) {
						for (int b = -1; b <= 1; b++) {
							safezone[i + a + 1][j + b + 1] = 1;
						}
					}
				}
			}
		}
		for (int i = 1; i < safezone.length - 1; i++) {
			for (int j = 1; j < safezone.length - 1; j++) {
				if (safezone[i][j] == 0) {
					answer++;
				}
			}
		}

		return answer;
	}

	// https://school.programmers.co.kr/learn/courses/30/lessons/120866/solution_groups?language=java&type=all
}
