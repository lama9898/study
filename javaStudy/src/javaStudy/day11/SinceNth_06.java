package javaStudy.day11;

import java.util.Arrays;

public class SinceNth_06 {
	public int[] solution(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,n-1,num_list.length);
    }
}