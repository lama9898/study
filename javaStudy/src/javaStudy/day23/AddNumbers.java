package javaStudy.day23;

public class AddNumbers {
	public int solution(int n) {
		int answer = 0;
		String temp = n + "";
		for (int i = 0; i < temp.length(); i++) {
			answer = answer + (temp.charAt(i) - '0');
		}
		return answer;
	}
	
	public int otherSolution(int n) {
        int answer = 0;
        while(true){
            answer+=n%10;
            if(n<10)
                break;

            n=n/10;
        }
        return answer;
    }
}
