package javaStudy.day29;

public class UniqueSort {
	public int[] solution(int[] numlist, int n) {
		int[] answer = numlist.clone();
		for (int i = 0; i < numlist.length; i++) {
			for (int j = 0; j < numlist.length; j++) {
				if (Math.abs(answer[i] - n) < Math.abs(answer[j] - n)) {
					int temp = answer[i];
					answer[i] = answer[j];
					answer[j] = temp;
				}
				else if (Math.abs(answer[i] - n) == Math.abs(answer[j] - n)) { //=말고 ==사용
					if (answer[i] > answer[j]) {
						int temp = answer[i];
						answer[i] = answer[j];
						answer[j] = temp;
					}
				}
			}
		}
		return answer;
    }
}
