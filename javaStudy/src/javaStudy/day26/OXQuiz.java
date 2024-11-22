package javaStudy.day26;

public class OXQuiz {
	public String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		for (int i = 0; i < quiz.length; i++) {
			String[] q = quiz[i].split(" ");
			boolean result = false;
			int sum = 0;
            if(q[1].equals("+")){
				sum = Integer.parseInt(q[0]) + Integer.parseInt(q[2]);
				result = sum == Integer.parseInt(q[4]);
            }
            else if(q[1].equals("-")){
				sum = Integer.parseInt(q[0]) - Integer.parseInt(q[2]);
				result = sum == Integer.parseInt(q[4]);
			}
			answer[i] = result ? "O" : "X";
		}
		return answer;
    }
}
