package javaStudy.day06;

public class ArithmeticSequenceAndQuery {
	public static void main(String[] args) {
		ArithmeticSequenceAndQuery test = new ArithmeticSequenceAndQuery();
	}
	
	public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        for(int i=0;i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for(int j=0;j<arr.length;j++){
                if(s<=j && e>=j && j%k==0){
                    answer[j]++;
                }
            }
        }
        return answer;
    }
	
	/*
	 for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (j % queries[i][2] == 0) arr[j] += 1;
            }
        }
	 */
}
