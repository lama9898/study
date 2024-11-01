package javaStudy.day09;

import java.util.List;
import java.util.ArrayList;

public class MakeArray01 {
	public static void main(String[] args) {

	}
    public int[] mySolution(int n, int k) {
        List<Integer> answer = new ArrayList<Integer>();
        for(int i=0;i<n/k;i++){
            if((i+1)*k>n) break;
            answer.add((i+1)*k);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public int[] otherSolution(int n, int k) {
        int count = n / k;
        int[] answer = new int[count];
        for (int i = 1; i <= count; i++) {
            answer[i - 1] = k * i;
        }

        return answer;
    }
}
