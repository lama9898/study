package javaStudy.day33;

import java.util.Arrays;

public class NumberK {
	public static void main(String[] args) {
		NumberK test = new NumberK();
		int[] arr = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] cmd = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		test.solution(arr, cmd);
	}

	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) { // 이차배열에서 각 배열 순회
			int[] sliced = new int[commands[i][1] - commands[i][0] + 1];
			for (int j = 0; j < sliced.length; j++) {
				sliced[j] = array[commands[i][0] - 1 + j];
			}
			Arrays.sort(sliced);
			answer[i] = sliced[commands[i][2] - 1];
		}
		return answer;
	}
	
	public int[] otherSolution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
