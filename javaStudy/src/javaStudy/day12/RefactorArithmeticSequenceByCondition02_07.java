package javaStudy.day12;

public class RefactorArithmeticSequenceByCondition02_07 {
	public int solution(int[] arr) {
		int answer = 0;
		int[] tempArr = arr.clone();
		int temp = 0;
		int diff = 0;
		while (true) {
			for (int i = 0; i < tempArr.length; i++) {
				if (tempArr[i] >= 50 && tempArr[i] % 2 == 0) {
					temp = tempArr[i];
					tempArr[i] = tempArr[i] / 2;
					if (temp != tempArr[i])
						diff++;
				} else if (tempArr[i] < 50 && tempArr[i] % 2 == 1) {
					temp = tempArr[i];
					tempArr[i] = tempArr[i] * 2 + 1;
					if (temp != tempArr[i])
						diff++;
				}
			}
			if (diff == 0) {
				break;
			}
			answer++;
			diff = 0;
		}
		return answer;
	}
}
