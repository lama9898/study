package javaStudy.day29;

public class NeedMoreMoney {
	public static void main(String[] args) {
		NeedMoreMoney test = new NeedMoreMoney();
		test.solution(3, 20, 4);
	}

	public long solution(int price, int money, int count) {
		long answer = 0;
		long howmuch = 0;
		for (int i = 1; i <= count; i++) {
			howmuch += price * i;
		}
		if (money - howmuch < 0) {
			answer = howmuch - money;
		} else
			answer = 0;
		return answer;
	}
}
