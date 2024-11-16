package javaStudy.day20;

public class FoldingBill {
	public int solution(int[] wallet, int[] bill) {
		int answer = 0;
		while (true) {
			boolean more = (wallet[0] >= bill[0] && wallet[1] >= bill[1])
					|| (wallet[0] >= bill[1] && wallet[1] >= bill[0]);
			if (more)
				break;
			if (bill[0] >= bill[1]) {
				bill[0] = bill[0] / 2;
			} else {
				bill[1] = bill[1] / 2;
			}
			answer++;
		}
		return answer;
	}
}
