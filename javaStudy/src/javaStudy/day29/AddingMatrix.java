package javaStudy.day29;

public class AddingMatrix {
	public int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = arr1.clone();
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] += arr2[i][j];
			}
		}
		return answer;
	}
}