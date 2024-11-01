//#03
package javaStudy.day09;

public class ReverseStringByNeed {
	public static void main(String[] args) {

	}
	public String mine(String my_string, int s, int e) {
		String answer = "";
        String temp ="";
        for(int i=e;i>=s;i--){
            temp += my_string.charAt(i);
        }
        answer = my_string.substring(0,s) + temp + my_string.substring(e+1,my_string.length());

        return answer;
	}
	public String mostLiked(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string.substring(s, e + 1));
        answer.reverse();
        return my_string.substring(0, s) + answer + my_string.substring(e + 1);
    }
}
