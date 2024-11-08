package javaStudy.day14;

public class ArrayOfMultipleValueOfElement_07 {
	public static void main(String[] args) {

		ArrayOfMultipleValueOfElement_07 test = new ArrayOfMultipleValueOfElement_07();
		int[] arr = { 5, 1, 4 };
		test.solution(arr);
	}

	public int[] solution(int[] arr) {
		int[] X = {};
		int length = 0;
		int idx = 0;
		for (int i = 0; i < arr.length; i++) {
			length = length + arr[i];
		}
		X = new int[length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				X[idx] = arr[i];
				idx++;
			}
		}

		return X;
	}
}
