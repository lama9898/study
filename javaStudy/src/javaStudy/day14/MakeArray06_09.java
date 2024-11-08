package javaStudy.day14;

import java.util.ArrayList;
import java.util.Stack;

public class MakeArray06_09 {
	public int[] solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>(); // stk
		for (int i = 0; i < arr.length; i++) {
			if (answer.size() == 0) {
				answer.add(arr[i]);
			} else if (answer.get(answer.size() - 1) == arr[i]) {
				answer.remove(answer.size() - 1);
			} else {
				answer.add(arr[i]);
			}
		}
		if (answer.isEmpty())
			answer.add(-1); // return new int[]{-1};
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] otherSolution(int[] arr) {

		Stack<Integer> stack = new Stack<>();

		for (int no : arr) {
			if (!stack.isEmpty() && no == stack.peek()) {
				stack.pop();
			} else {
				stack.push(no);
			}
		}

		return stack.isEmpty() ? new int[] { -1 } : stack.stream().mapToInt(i -> i).toArray();
	}
}
