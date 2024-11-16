package javaStudy.day20;

public class OddEvenCount_07 {
	public int[] solution(int[] num_list) {
		int[] answer = new int[2];
		for (int num : num_list) {
			if (num % 2 == 0)
				answer[0]++;
			else
				answer[1]++;
		}
		return answer;
	}

	public int[] otherSolution(int[] num_list) {
		int[] answer = new int[2];

		for (int i = 0; i < num_list.length; i++)
			answer[num_list[i] % 2]++;

		return answer;
	}
}
