package javaStudy.day26;

public class RemoveTheSmallestNumInArray {
	public int[] solution(int[] arr) {
		int[] answer = {};
		int min = 0, idx = 0;
		if (arr.length <= 1) {
			answer = new int[1];
			answer[0] = -1;
		}
        else{
			answer = new int[arr.length - 1];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] < arr[min])
					min = i;
			}
			for (int i = 0; i < arr.length; i++) {
				if (i != min) {
					answer[idx] = arr[i];
					idx++;
				}
			}
		}
		return answer;
	}
}
