package javaStudy.day05;

public class ArithmeticSequnceAndQuery {
	public static void main(String[] args) {
		
		ArithmeticSequnceAndQuery test = new ArithmeticSequnceAndQuery();
		int[] arr = {0, 1, 2, 4, 3};
		int[][] queries = {{0, 4, 2},{0, 3, 2},{0, 2, 2}};
		System.out.print(test.problem2(arr, queries)); 
	}
	
    public int[] problem1(int[] arr, int[][] queries) {
        int[] answer = arr.clone();
        int temp=0;
        for(int i=0;i<queries.length;i++) {
        		temp = answer[queries[i][0]];
        		answer[queries[i][0]] = answer[queries[i][1]];
        		answer[queries[i][1]] = temp;
        }
        return answer;
    }
    
    //★★★★★★★★★★★★★★★★
    public int[] problem2(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        // 정수배열 arr, 2차원 정수배열 [s,e,k] queries
        // 각 쿼리마다 arr[i]의 최소값 찾기
        int flag = 0;
        int min = 10000;
        
        for(int i=0;i<queries.length;i++) {
    		for(int j=0;j<arr.length;j++) {
    			if(queries[i][0]<=j && queries[i][1]>=j) // s<=i<=k
    				if(arr[j]>queries[i][2] && min>arr[j]) {//arr[i]>k
    					answer[i] = arr[j];
    	    			System.out.println(answer[i]);
    				}
    			
    		}	
        }
        return answer;
    }
}
