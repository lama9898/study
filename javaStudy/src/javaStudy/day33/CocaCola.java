package javaStudy.day33;

public class CocaCola {
	
	/*
		콜라를 받기 위해 마트에 주어야 하는 병 수 a, 빈 병 a개를 가져다 주면 마트가 주는 콜라 병 수 b, 상빈이가 가지고 있는 빈 병의 개수 n이 매개변수로 주어집니다.
		상빈이가 받을 수 있는 콜라의 병 수를 return 하도록 solution 함수를 작성해주세요.
		
	 */
	public static void main(String[] args) {
		CocaCola test = new CocaCola();
		test.solution(2, 1, 20);
	}

	public int solution(int a, int b, int n) { // a개를 내고 b개를 받음, n개
		int answer = 0; // answer = 아무에게도 말하지 마세요
		int leftover = 0;
		int cola = n;

		while (cola >= a) {
			int newCola = (cola / a) * b; // 교환으로 받은 콜라
			leftover = cola % a; // 남은 빈병
			answer += newCola;
			cola = newCola + leftover;
		}

		return answer;
	}

	public int otherSolution(int a, int b, int n) {
		int answer = 0;

		while (n >= a) {
			answer += b * (n / a);
			n = b * (n / a) + n % a;
		}

		return answer;
	}
}
