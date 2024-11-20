package javaStudy.day23;

public class ByeByeAEIOU {
	public String solution(String my_string) {
        String answer = my_string.replaceAll("[aeiou]","");
        return answer;
    }
}
