package javaStudy.day28;

public class StringCombineExistsInAnotherString {
	public int solution(String[] spell, String[] dic) {
		int answer = 2;
		for (String word : dic) {
			if (word.length() == spell.length) {
				for (String s : spell) {
					if (word.contains(s)) {
						answer = 1;
					}
					else {
						answer = 2;
						break;
					}
				}
				if (answer == 1)
					break;
			}
		}
		return answer;
    }
}
