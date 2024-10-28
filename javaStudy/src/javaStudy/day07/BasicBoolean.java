package javaStudy.day07;

public class BasicBoolean {
	public static void main(String[] args) {
		BasicBoolean test = new BasicBoolean();
	}
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        // (x1 ∨ x2) ∧ (x3 ∨ x4) => v == | or, ^ == & and
        answer = (x1 || x2) && (x3||x4);
        return answer;
    }
}
