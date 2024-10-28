package javaStudy.day06;

import java.util.ArrayList;
import java.util.List;

public class CollatzConjecture {
	public static void main(String[] args) {
		
	}
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<Integer>();
        answer.add(n);
        while(n!=1){
	        if(n%2==0) { n = n/2; }
	        else { n = (3*n+1); }
	        
	        answer.add(n);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
