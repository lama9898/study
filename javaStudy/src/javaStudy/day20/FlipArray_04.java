package javaStudy.day20;

public class FlipArray_04 {
	public int[] solution(int[] num_list) {
		int[] answer = num_list.clone();
		for (int i = 0; i < answer.length / 2; i++) {
			int temp = answer[i];
			answer[i] = answer[answer.length - 1 - i];
			answer[answer.length - 1 - i] = temp;
		}
		return answer;
	}

	public int[] otherSolution(int[] num_list) {
		int[] answer = new int[num_list.length];
		for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length - i - 1];
		}
		return answer;
	}
}
