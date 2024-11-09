package javaStudy.day15;

import java.util.stream.IntStream;

public class BiggerArray_02 {
	public int mySolution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1=0, sum2=0;
        if(arr1.length > arr2.length){
            answer = 1;
        }
        else if(arr1.length < arr2.length){
            answer = -1;
        }
        else{
            for(int i=0;i<arr1.length;i++){
                sum1 = sum1 + arr1[i];
                sum2 = sum2 + arr2[i];
            }
            if(sum1>sum2) answer = 1;
            else if(sum1<sum2) answer = -1;
            else answer = 0;
        }
        return answer;
    }
	
	public int otherSolution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if(answer == 0) {
            answer = Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }
}
