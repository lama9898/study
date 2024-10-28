package javaStudy.day06;

import java.util.ArrayList;
import java.util.List;

public class CountUp {
	public static void main(String[] args) {

	}

	public List solution(int start_num, int end_num) {
        List answer = new ArrayList();
        for(int i=start_num;i<=end_num;i++){
        	answer.add(i);
        }
        
        return answer;
    }
	
	public int[] solution2(int start, int end) {
		int[] answer = new int[end-start+1];
		for(int i=start;i<=end;i++) {
			answer[i-start] =i; 
		}
		return answer;
	}
}
