package javaStudy.day23;

public class NumberOfDice {
	public static void main(String[] args) {
		NumberOfDice test = new NumberOfDice();
		int[] arr = { 10,8,6 };
		test.solution(arr, 3);
	}

	public int wrongSolution01(int[] box, int n) {
		int answer = 0;
		int l = 0, w = 0, h = 0;
		while (true) {
			w++;
			if (w * n >= box[0]) break;
		}
		while (true) {
			l++;
			if (l * n >= box[1]) break;
		}
		while (true) {
			h++;
			if (h * n >= box[2]) break;
		}
		answer = l * w * h;
		System.out.println(answer);
		return answer;
	}

	public int solution(int[] box, int n) {
		int answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		return answer;
	}
}
