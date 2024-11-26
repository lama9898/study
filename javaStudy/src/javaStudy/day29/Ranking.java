package javaStudy.day29;

public class Ranking {
	public static void main(String[] args) {
		Ranking test = new Ranking();
		int[][] arr = { { 1, 3 }, { 3, 1 }, { 2, 3 }, { 3, 2 }, { 1, 2 }, { 1, 1 } };
		test.solution(arr);
	}

	public int[] solution(int[][] score) {
		int[] answer = new int[score.length];
		double[] avg = new double[score.length];
		for (int i = 0; i < score.length; i++) {
			avg[i] = (score[i][0] + score[i][1]) / 2.0; //double로 나눠야지 소수점까지 나옴.
		}
		for (int i = 0; i < avg.length; i++) {
			int rank = 1;
			for (int j = 0; j < avg.length; j++) {
				if (avg[i] < avg[j])
					rank++;
			}
			answer[i] = rank;
		}
		return answer;
	}
}
