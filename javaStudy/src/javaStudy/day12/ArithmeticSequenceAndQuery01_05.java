package javaStudy.day12;

public class ArithmeticSequenceAndQuery01_05 {
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0;i<queries.length;i++){
            for(int j=queries[i][0];j<=queries[i][1];j++){
                arr[j]++;
            }
        }
        answer = arr;
        return answer;
    }
}