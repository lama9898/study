package javaStudy.day12;

public class WhatsMoreBig_01 {
	public int mySolution(int[] num_list) {
		int answer = 0;
		int even = 0, odd = 0;
		for (int i = 0; i < num_list.length; i++) {
			if (i % 2 == 0) {	// 홀수
				odd += num_list[i];
			} else {	// 짝수
				even += num_list[i];
			}
		}
		if (odd > even)
			answer = odd;
		else
			answer = even;
		// answer = odd>even?odd:even;
		return answer;
	}

}
