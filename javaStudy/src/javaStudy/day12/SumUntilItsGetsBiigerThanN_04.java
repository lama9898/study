package javaStudy.day12;

public class SumUntilItsGetsBiigerThanN_04 {
	public int mySolution(int[] numbers, int n) {
        int answer = 0;
        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
            if(answer>n) break;
        }
        return answer;
    }
	
	public int otherSolution(int[] numbers, int n) {
        int answer = 0;

        for(int i = 0; answer <= n; i++) {
            answer += numbers[i];
        }

        return answer;
    }
}
