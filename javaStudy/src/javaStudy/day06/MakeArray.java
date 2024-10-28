package javaStudy.day06;

import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

//★★★★★★★★★★★★★★★★
public class MakeArray {

	public static void main(String[] args) {
		MakeArray test = new MakeArray();
		System.out.println(test.solution(10,549).get(0));
	}
	public List solution(int l, int r) {
		List<Integer> answer = new ArrayList<Integer>();
		String pattern = "^[05]{1,}";
		boolean none = true;
		for(int i=l;i<=r;i++){
			if(Pattern.matches(pattern,i+"")) {
				answer.add(i);
				none = false;
			}
		}
		if(none) {
			answer.add(-1);
		}
		return answer;
	}
	
	/*
	 import java.util.*;

	class Solution {
	    public int[] solution(int l, int r) {
	        // 이진법 활용
	        // l = 5, r = 555
	        // 5,   50,   55,   500,   505,   550,   555
	        // 1    10    11    100    101    110    111
	        // 1     2     3      4      5      6      7
	
	        // 지수는 자릿수
	        // 2^0 <= x < 2^3
	        int digit = String.valueOf(r).length();
	        int exponent = (int)Math.pow(2.0, digit);
	
	        List<Integer> list = new ArrayList<>();
	        for (int i = 0; i < exponent; i++) {
	            String binaryString = Integer.toBinaryString(i);
	            int target = Integer.parseInt(binaryString) * 5;
	            if (target >= l && target <= r)
	                list.add(target);
	        }
	
	        if (list.isEmpty())
	            return new int[] {-1};
	        else
	            return list.stream().mapToInt(i -> i).toArray();
	    }
	}
	 */
}
