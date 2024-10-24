package javaStudy.day04;


public class MixStrings {
    public static void main(String[] args) {

    	MixStrings test = new MixStrings();
    	System.out.println(test.solution("abc","ABC"));
    }
    
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0;i<str1.length();i++){
            answer = answer + str1.charAt(i)+str2.charAt(i);
        }
        return answer;
    }

}
