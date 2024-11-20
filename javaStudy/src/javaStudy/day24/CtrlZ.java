package javaStudy.day24;

import java.util.Stack;

public class CtrlZ {
	public static void main(String[] args) {
		CtrlZ test = new CtrlZ();
		test.solution("1 2 Z 3");
	}
	public int solution(String s) {
        int answer = 0;
        int temp = 0;
        String[] ctrlZ = s.split(" ");
        for(int i=0;i<ctrlZ.length;i++){
            if(ctrlZ[i].matches("-?[0-9]{0,}")){
                answer += Integer.parseInt(ctrlZ[i]);
                temp = Integer.parseInt(ctrlZ[i]);
            }
            else if(ctrlZ[i].equals("Z")){
                answer = answer - temp;
            }
        }
        return answer;
    }
	
	public int otherSolution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
