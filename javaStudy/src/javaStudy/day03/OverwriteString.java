package javaStudy.day03;

public class OverwriteString {
    public static void main(String[] args) {

    	OverwriteString test = new OverwriteString();
    	
    	System.out.println(test.solution("He11oWro1d","lloWrol",2));
    }
    
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0,s)+overwrite_string+my_string.substring(overwrite_string.length()+s);
        
        return answer;
    }

}
