package javaStudy.day10;

public class Closest1_03 {
	public static void main(String[] args) {

	}

	public int solution(int[] arr, int idx) {
		int answer = -1;
		for (int i = idx; i < arr.length; i++) {
			if (arr[i] == 1) {
				answer = i;
				break;
			}
		}
		return answer;
	}
}
