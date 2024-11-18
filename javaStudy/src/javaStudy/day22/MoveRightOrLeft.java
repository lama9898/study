package javaStudy.day22;

public class MoveRightOrLeft {
	public static void main(String[] args) {
		MoveRightOrLeft test = new MoveRightOrLeft();
		int[] arr = { 4, 455, 6, 4, -1, 45, 6 };
		test.solution(arr, "right");
	}

	public int[] solution(int[] numbers, String direction) {
		int[] answer = new int[numbers.length];
		int dir = direction.equals("left") ? -1 : 1; // 1:right, -1:left
		if (dir == 1) {
			for (int i = 1; i < answer.length; i++) {
				answer[i] = numbers[i - 1];
			}
			answer[0] = numbers[answer.length - 1];
		} else {
			for (int i = 0; i < answer.length - 1; i++) {
				answer[i] = numbers[i + 1];
			}
			answer[answer.length - 1] = numbers[0];
		}
		return answer;
	}
}
