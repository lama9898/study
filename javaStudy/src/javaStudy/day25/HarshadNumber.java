package javaStudy.day25;

public class HarshadNumber {
	public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        String hashad = x+"";
        for(int i=0;i<hashad.length();i++){
            sum += hashad.charAt(i)-'0';
        }
        answer = x%sum==0?true:false;
        return answer;
    }
}
