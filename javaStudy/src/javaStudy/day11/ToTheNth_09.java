package javaStudy.day11;

import java.util.Arrays;

public class ToTheNth_09 {
	public int[] mySolution(int[] num_list, int n) {
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[i] = num_list[i];
        }
        return answer;
    }
	public int[] otherSolution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }
}
