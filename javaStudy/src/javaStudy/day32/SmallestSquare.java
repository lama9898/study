package javaStudy.day32;

public class SmallestSquare {
	public int solution(int[][] sizes) {
		int answer = 0;
		int longer = sizes[0][0] > sizes[0][1] ? sizes[0][0] : sizes[0][1];
		int shorter = sizes[0][0] <= sizes[0][1] ? sizes[0][0] : sizes[0][1];
		for (int i = 1; i < sizes.length; i++) {
			int l = sizes[i][0] > sizes[i][1] ? sizes[i][0] : sizes[i][1];
			int s = sizes[i][0] <= sizes[i][1] ? sizes[i][0] : sizes[i][1];
			if (l > longer)
				longer = l;
			if (s > shorter)
				shorter = s;
		}
		answer = shorter * longer;
		return answer;
	}
}
