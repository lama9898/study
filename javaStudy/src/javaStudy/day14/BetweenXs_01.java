package javaStudy.day14;

import java.util.Arrays;

public class BetweenXs_01 {
	/*	// split으로 나누면 x0001 인 경우 "", "0001" 로 나뉘지 않음
	    public int[] solution(String myString) {
	        String[] splitByxs= myString.split("x");
	        int[] answer = new int[splitByxs.length];
	        for(int i=0;i<answer.length;i++){
	            answer[i] = splitByxs[i].length();
	        }
	        return answer;
    	}
	 */
	
    public int[] mySolution(String myString) {
        String[] splitByxs= myString.split("x",-1);
        int[] answer = new int[splitByxs.length];
        for(int i=0;i<answer.length;i++){
            answer[i] = splitByxs[i].length();
        }
        return answer;
    }
    
    public int[] otherSolution(String myString) {

        return Arrays.stream(myString.split("x", myString.length()))
            .mapToInt(x -> x.length())
            .toArray();
    }
}
