package javaStudy.day04;

public class MultipleString {
    public static void main(String[] args) {

    	MultipleString test = new MultipleString();
    	System.out.println(test.solution("sample",3));
    }
    
    public String solution(String my_string, int k) {
        String answer = "";
        /*
	        for(int i=0;i<k;i++){
	            answer += my_string;
	        }
         */
        answer = my_string.repeat(k);
        return answer;
    }
}
