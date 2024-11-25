package javaStudy.day28;

public class DoesTheDivideEnd {
	public int solution(int a, int b) {
		int answer = 1;
		int head = a;
		int bottom = b;
		for (int i = 2; i <= a; i++) {
			if (head % i == 0 && bottom % i == 0) {
				head /= i;
				bottom /= i;
			}
			if (head == 1 || bottom < i)
				break;
		}
		while (bottom != 1) {
			if (bottom % 10 == 0) {
				bottom /= 10;
			}
			else if (bottom % 5 == 0) {
				bottom /= 5;
			}
			else if (bottom % 2 == 0) {
				bottom /= 2;
			}
			else {
				answer = 2;
				break;
			}
		}
		return answer;
    }
	
	
	//최대공약수 구하기
	public int findGCD(int a, int b) {
		if (a % b == 0) {	return b;	}
		return findGCD(b, a % b);
	}
}
