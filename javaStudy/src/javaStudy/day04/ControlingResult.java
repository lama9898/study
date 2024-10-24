package javaStudy.day04;

public class ControlingResult {
	public static void main(String[] args) {
		ControlingResult test = new ControlingResult();
	}
	
	public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        if(ineq.equals(">")){
            answer = eq.equals("=") ? (n>=m ? 1:0) : (n>m? 1: 0); 
        }
        else {
        	answer = eq.equals("=") ? (n<=m ? 1:0) : (n<m? 1: 0); 
        }
        return answer;
    }

}
