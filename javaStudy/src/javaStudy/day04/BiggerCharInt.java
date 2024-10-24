package javaStudy.day04;

public class BiggerCharInt {
	public static void main(String[] args) {

		BiggerCharInt test = new BiggerCharInt();
    }
	
    public int solution(int a, int b) {
        int answer = 0;
//        String ab = String.valueOf(a)+String.valueOf(b);
//        String ba = String.valueOf(b)+String.valueOf(a);
//        if(Integer.parseInt(ab)>=Integer.parseInt(ba)) answer = Integer.parseInt(ab);
//        else answer = Integer.parseInt(ba);
        int ab = Integer.parseInt(""+a+b);
        int ba = Integer.parseInt(""+b+a);
        answer = ab > ba ? ab : ba;
        return answer;
    }
    
    public int abAndmulti(int a, int b) {
    	// 양의 정수 a와 b가 주어졌을 때, a ⊕ b와 2 * a * b 중 더 큰 값을 return
//    	  int answer = 0;
//        int ab = Integer.parseInt(""+a+b);
//        int ab2 = a * b * 2;
//        answer = ab >= ab2 ? ab : ab2;
//        return answer;
    	return Math.max(Integer.parseInt(String.valueOf(a)+String.valueOf(b)),2*a*b);
    }
}
