package javaStudy.day18;

/*
	정수 n이 매개변수로 주어질 때, 다음과 같은 n × n 크기의 이차원 배열 arr를 return 하는 solution 함수를 작성해 주세요.
	arr[i][j] (0 ≤ i, j < n)의 값은 i = j라면 1, 아니라면 0입니다.
 */
public class SpecialTwoDimensionalArray01_03 {
	public int[][] mySolution(int n) {
		int[][] answer = new int[n][n];
		for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				answer[i][j] = i == j ? 1 : 0;
			}
		}
		return answer;
	}
	
	public int[][] otherSolution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
}
