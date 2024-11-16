package javaStudy.day20;

public class DivisionAndLeftover_02 {
	public int[] solution(int money) {
		int[] answer = new int[2]; // 최대 아메리카노 주문가능 수, 남는 돈
		int count = 0;
		while (money >= 5500 * count) {
			count++;
		}
		answer[0] = count - 1;
		answer[1] = money - 5500 * (count - 1);
		return answer;
	}

	public int[] otherSolution(int money) {
		return new int[] { money / 5500, money % 5500 };
	}
}
