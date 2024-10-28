package javaStudy.day06;

import java.util.ArrayList;
import java.util.List;

public class MakeArray04 {
	public static void main(String[] args) {
		MakeArray04 test = new MakeArray04();
	}
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<Integer>();
        int i=0;
        while(i<arr.length){
            if(answer.isEmpty()){
            	answer.add(arr[i]);
            	i++;
            }
            else {
            	if(answer.get(answer.size()-1)<arr[i]) {
            		answer.add(arr[i]);
            		i++;
            	}
            	else {
            		answer.remove(answer.size()-1);
            	}
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
    
    // 또 다른 방법 : stack/queue 사용하기
}
