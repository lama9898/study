package javaStudy.day18;

public class TwoDimensionalInSpiral_07 {
	public int[][] solution(int n) {
		int[][] answer = new int[n][n];
		int r = 0, c = 0;
		int direction = 0; // 0: 왼->오, 1: 오->밑, 2: 오->왼, 3: 왼->위
		for (int i = 1; i <= n * n; i++) {
			answer[r][c] = i;
			switch (direction) {
			case 0:
				c++;
				if (c == n - 1 || answer[r][c + 1] != 0) {
					direction = 1;
				}
				break;
			case 1:
				r++;
				if (r == n - 1 || answer[r + 1][c] != 0) {
					direction = 2;
				}
				break;
			case 2:
				c--;
				if (c == 0 || answer[r][c - 1] != 0) {
					direction = 3;
				}
				break;
			case 3:
				r--;
				if (r == 0 || answer[r - 1][c] != 0) {
					direction = 0;
				}
				break;
			}
		}
		return answer;
	}
	
	public int[][] otherSolution(int n) {
	    int[][] answer = new int[n][n];
	    int top = 0, bottom = n - 1, left = 0, right = n - 1;
	    int num = 1;

	    while (num <= n * n) {
	        // 위쪽 경계를 따라 오른쪽으로 이동
	        for (int i = left; i <= right && num <= n * n; i++) {
	            answer[top][i] = num++;
	        }
	        top++; // 위쪽 경계를 아래로 한 칸 내림

	        // 오른쪽 경계를 따라 아래쪽으로 이동
	        for (int i = top; i <= bottom && num <= n * n; i++) {
	            answer[i][right] = num++;
	        }
	        right--; // 오른쪽 경계를 왼쪽으로 한 칸 이동

	        // 아래쪽 경계를 따라 왼쪽으로 이동
	        for (int i = right; i >= left && num <= n * n; i--) {
	            answer[bottom][i] = num++;
	        }
	        bottom--; // 아래쪽 경계를 위로 한 칸 이동

	        // 왼쪽 경계를 따라 위쪽으로 이동
	        for (int i = bottom; i >= top && num <= n * n; i--) {
	            answer[i][left] = num++;
	        }
	        left++; // 왼쪽 경계를 오른쪽으로 한 칸 이동
	    }

	    return answer;
	}
}
