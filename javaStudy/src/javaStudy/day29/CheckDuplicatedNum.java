package javaStudy.day29;

import java.util.ArrayList;
import java.util.Stack;

public class CheckDuplicatedNum {
	public static void main(String[] args) {
		CheckDuplicatedNum test = new CheckDuplicatedNum();
		int[] arr = { 4, 4, 4, 3, 3 };
		test.solution(arr);
	}

	// 연속 숫자 제거
	public int[] solution(int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] != arr[i]) {
				answer.add(arr[i]);
			}
		}
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	//스택 큐
	public Stack<Integer> otherSolution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int num : arr) {
			if (stack.size() == 0 || stack.peek() != num) {
				stack.push(num);
			}
		}
		return stack;
	}

	//////////////////////
	// 중복확인
	public int[] noDuplicate(int[] arr) {
		int[] answer = {};
		String nums = arr[0] + "";
		String[] numsArr = {};
		for (int i = 1; i < arr.length; i++) {
			String temp = arr[i] + "";
			if (nums.contains(temp) == false) {
				nums = nums + " " + arr[i];
			}
		}
		numsArr = nums.trim().split(" ");
		answer = new int[numsArr.length];
		for (int i = 0; i < numsArr.length; i++) {
			answer[i] = Integer.parseInt(numsArr[i]);
			System.out.println(answer[i]);
		}
		return answer;
	}
}
