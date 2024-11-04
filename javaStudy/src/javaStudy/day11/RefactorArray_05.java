package javaStudy.day11;

import java.util.ArrayList;
import java.util.Arrays;

public class RefactorArray_05 {
	public static void main(String[] args) {

		RefactorArray_05 test = new RefactorArray_05();
		int[] arr = { 0, 1, 2, 3, 4, 5 };
		int[] query = { 4, 1, 2 };

		test.fail(arr, query);
		test.mySolution(arr, query);
	}

	public int[] fail(int[] arr, int[] query) {
		ArrayList<Integer> answerlist = new ArrayList<>();
		for (int num : arr) {
			answerlist.add(num);
		}
		for (int i = 0; i < query.length; i++) {
			if (i % 2 == 0) { // 짝수
				for (int j = query[i] + 1; j < answerlist.size(); j++) {
					answerlist.remove(arr[j]);
				}
			} else { // 홀수
				for (int j = 0; j < query[i]; j++) {
					answerlist.remove(arr[j]);
				}
			}
		}
		return answerlist.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] mySolution(int[] arr, int[] query) {
        int[] answer = arr.clone();
        for(int idx=0;idx<query.length;idx++){
            if(idx%2==0){
                int[] temp = new int[query[idx]+1];
                for(int i=0;i<=query[idx];i++){
                    temp[i] = answer[i];
                }
                answer = temp;
            }
            else{
                int[] temp = new int[answer.length-query[idx]];
                for(int i=query[idx];i<answer.length;i++){
                    temp[i-query[idx]] = answer[i];
                }
                answer = temp;
            }
        }

        return answer;
    }
	
	public int[] otherSolution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }
}
