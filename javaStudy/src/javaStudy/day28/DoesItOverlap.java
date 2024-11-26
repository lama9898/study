package javaStudy.day28;

public class DoesItOverlap {
	public int solution(int[][] lines) {
		int answer = 0;
		int[] lineCount = new int[201];
		for (int i = 0; i < lines.length; i++) {
			for (int j = lines[i][0]; j <= lines[i][1]; j++) {
				lineCount[j + 100]++;
			}
		}
		for (int l : lineCount) {
			if (l >= 2)
				answer++;
		}
		return answer;
	}

	public int otherSolution(int[][] lines) {
		int answer = 0;
		for (int i = -100; i < 100; i++) {
			int line = 0;
			if (lines[0][0] <= i && lines[0][1] > i)
				line++;
			if (lines[1][0] <= i && lines[1][1] > i)
				line++;
			if (lines[2][0] <= i && lines[2][1] > i)
				line++;

			if (line > 1)
				answer++;
		}

		return answer;
	}
}
