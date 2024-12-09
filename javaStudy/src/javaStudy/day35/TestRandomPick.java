package javaStudy.day35;

import java.util.ArrayList;

public class TestRandomPick {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4, 2 };
		TestRandomPick test = new TestRandomPick();
		test.solution(arr);
	}

	public int[] wrongSolution(int[] answers) {
		int[] answer = {};
		// %5+1 , 2/%5+1(2제외) , 3-1-2-4-5- 2번씩 반복
		int[] count = new int[3];
		int[] arr = { 3, 1, 2, 4, 5 };
		int change = 0;
		int no2 = 0;
		int max = 0, size = 1, idx = 0;
		for (int i = 0; i < answers.length; i++) {
			if (i % 5 + 1 == answers[i]) {
				count[0]++;
			}

			if (i % 2 == 0 && answers[i] == 2) {
				count[1]++;
			} else if (i % 2 == 1) {
				if (no2 % 5 == 1) no2++;
				if (no2 % 5 + 1 == answers[i]) { count[1]++; }
			}

			if (i % 2 == 1) change++;
			if (answers[i] == arr[change % 5]) count[2]++;
			System.out.println("count[0]: " + count[0] + " - count[1]: " + count[1] + " - count[2]: " + count[2]);
		}
		max = 0;
		for (int i = 0; i < 3; i++) {
			if (max < count[i]) {
				max = count[i];
				size = 1;
				System.out.println("max " + max);
			} else if (max == count[i])
				size++;
			System.out.println("size " + size);
		}
		answer = new int[size];
		System.out.println("answer length " + answer.length);
		for (int i = 0; i < count.length; i++) {
			if (count[i] == max) {
				answer[idx] = i + 1;
				idx++;
			}
		}
		return answer;
	}

	public int[] solution(int[] answers) {
		ArrayList<Integer> answer = new ArrayList<>();
		int[] count = new int[3];
		int[] std1 = { 1, 2, 3, 4, 5 };
		int[] std2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] std3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int size = 0, max = 0, idx = 0;

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == std1[i % std1.length]) { count[0]++; }
			if (answers[i] == std2[i % std2.length]) { count[1]++; }
			if (answers[i] == std3[i % std3.length]) { count[2]++; }
		}

		max = Math.max(count[0], Math.max(count[1], count[2]));
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) { answer.add(i + 1); }
		}

		return answer.stream().mapToInt(Integer::intValue).toArray();
	}
}
