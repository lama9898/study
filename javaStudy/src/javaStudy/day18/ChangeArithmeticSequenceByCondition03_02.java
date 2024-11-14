package javaStudy.day18;

import java.util.stream.IntStream;

public class ChangeArithmeticSequenceByCondition03_02 {
	public int[] mySolution(int[] arr, int k) {
		int[] answer = arr.clone();
		if (k % 2 == 1) {
			for (int i = 0; i < arr.length; i++) {
				answer[i] *= k;
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				answer[i] += k;
			}
		}
		return answer;
	}
	
	public int[] otherSolution(int[] arr, int k) {
        if(k%2==0) {
            return IntStream.of(arr).map(i->i+k).toArray();
        }

        return IntStream.of(arr).map(i->i*k).toArray();
    }
}
