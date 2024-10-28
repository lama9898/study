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
        
        //배열의 원소 초기화하기 : Arrays.fill(answer, -1);
        
        for(int i=0;i<queries.length;i++) {
        	int min = 1000000;
    		for(int j=0;j<arr.length;j++) {	
    			if(queries[i][0]<=j && queries[i][1]>=j) {
    				if(arr[j]>queries[i][2]) {
    					if(min>arr[j]) {
    						min  = arr[j];
    					}
    				}
    			}
    		}
    		if(min == 1000000) {
    			min = -1;
    		}
    		answer[i] = min;
        }

		System.out.printf("%d %d %d",answer[0],answer[1],answer[2]);
        return answer;
    }
}
