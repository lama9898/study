package javaStudy.day11;

import java.util.ArrayList;

public class ElementsJumpingN_10 {
	public int[] solution(int[] num_list, int n) {
		ArrayList<Integer> answer = new ArrayList<Integer>();
		for (int i = 0; i * n < num_list.length; i++) {
			answer.add(num_list[i * n]);
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	public int[] otherSolution(int[] num_list, int n) {
        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int idx = 0;
        int[] answer = new int[N];
        for (int i = 0;i < num_list.length;i+=n)
            answer[idx++] = num_list[i];
        return answer;
    }
}
