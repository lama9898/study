package javaStudy.day07;

import java.util.Arrays;

public class ConcatenateStrings {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		
		ConcatenateStrings test = new ConcatenateStrings();
		System.out.println(test.solution("helloooo", a));
	}
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        for(int i=0;i<index_list.length;i++){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
