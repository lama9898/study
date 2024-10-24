package javaStudy.day04;

public class OddAndEven {
	public static void main(String[] args) {
		OddAndEven test = new OddAndEven();
		String a = "a";
	}


	public int solution(int n) {
        int answer = 0;
//        if(n%2==1){
//            for(int i=1;i<=n;i+=2)
//                answer = answer + i;
//        }
//        else{
//            for(int i=2;i<=n;i+=2){
//                answer = answer + i*i;
//            }
//        }
		for(int i = n; i >= 0; i -= 2)
			answer += (n % 2 == 0) ? i * i : i;
		return answer;
	}
}
