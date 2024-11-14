package javaStudy.day18;

public class MakingSquare_05 {
	public int[][] mySolution(int[][] arr) {
		int row = arr.length;
		int column = arr[0].length;
		int[][] answer = {};
		while (row > column) {
			column++;
		}
		while (row < column) {
			row++;
		}
		answer = new int[row][column];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				answer[i][j] = arr[i][j];
			}
		}
		return answer;
	}

	public int[][] otherSolution(int[][] arr) {
		int max = arr.length > arr[0].length ? arr.length : arr[0].length;
		int[][] array = new int[max][max];

		for (int i = 0; i < arr.length; i++) {
			System.arraycopy(arr[i], 0, array[i], 0, arr[0].length);
		}
		return array;
	}
}
