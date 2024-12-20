package javaStudy.day19;

public class PizzaProblem {
	
	/*
		머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
		모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요.
	 */
	public int pizzaPizzaProblem01(int n) { // n:인원
		int answer = 0; // 피자 수
		while (7 * answer < n) {
			answer++;
		}
		return answer;
	}
	
	/*
		머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때,
		n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 */
	public int pizzaPizzaProblem02(int n) {
		int answer = 1;
		while (answer * 6 % n != 0) {
			answer++;
		}
		return answer;
	}
	
	/*
		머쓱이네 피자가게는 피자를 두 조각에서 열 조각까지 원하는 조각 수로 잘라줍니다.
		피자 조각 수 slice와 피자를 먹는 사람의 수 n이 매개변수로 주어질 때, n명의 사람이 최소 한 조각 이상 피자를 먹으려면
		최소 몇 판의 피자를 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
	 */
	public int solution(int slice, int n) {
		int answer = 0;
		while (answer * slice < n) {
			answer++;
		}
		return answer;
	}
	
}
