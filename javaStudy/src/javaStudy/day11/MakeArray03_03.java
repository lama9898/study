package javaStudy.day11;

public class MakeArray03_03 {
	public static void main(String[] args) {

	}
	public int[] mySolution(int[] arr, int[][] intervals) {
		int[] answer = new int[intervals[0][1]-intervals[0][0]+1 + intervals[1][1]-intervals[1][0]+1];
        // intervals[0][1]-intervals[0][0]+1 + intervals[1][1]-intervals[1][0]+1
        for(int i=0;i<intervals[0][1]-intervals[0][0]+1;i++){
            answer[i] = arr[intervals[0][0]+i];
        }
        for(int i=0;i<intervals[1][1]-intervals[1][0]+1;i++){
            answer[intervals[0][1]-intervals[0][0]+1+i] = arr[intervals[1][0]+i];
        }
        return answer;
    }
	
}
