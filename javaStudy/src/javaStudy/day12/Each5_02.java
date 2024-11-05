package javaStudy.day12;

public class Each5_02 {
	public String[] mySolution(String[] names) {
		int length = names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1;
		String[] answer = new String[length];
		int count = 0;
		for (int i = 0; i < names.length; i++) {
			if (i % 5 == 0) {
				answer[count] = names[i];
				count++;
			}
		}
		return answer;
	}

	public String[] otherSolution(String[] names) {
		int idx = 0;
		String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
		for (int i = 0; i < names.length; i += 5)
			answer[idx++] = names[i];
		return answer;
	}
}
