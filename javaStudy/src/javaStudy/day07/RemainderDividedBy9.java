package javaStudy.day07;

public class RemainderDividedBy9 {
	public static void main(String[] args) {
		
	}
    public int solution(String number) {
        int answer = 0;
        for(int i=0;i<number.length();i++){
            answer += Character.getNumericValue(number.charAt(i));
            // 다른 방법 :
            // answer += number.charAt(i) - '0';
        }
        return answer%9;
    }
}
