package javaStudy.day24;

public class IsItPow {
	public long solution(long n) {
		long answer = -1;
		for (long i = 1; i * i <= n; i++) { //i*i의 경우 오버플로우 발생가능, i<=(long)Math.sqrt(n) 사용가능
			if (i * i == n) {
				answer = (long) (i + 1) * (i + 1);
				break;
			}
		}
		return answer;
	}
	
	public long otherSolution(long n) {
        long answer = -1;
        if(Math.pow((int)Math.sqrt(n),2)==n){
            answer = (long)Math.pow(Math.sqrt(n)+1,2);
        }
        return answer;
    }
}
