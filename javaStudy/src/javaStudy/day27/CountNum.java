package javaStudy.day27;

public class CountNum {
	public int solution(int[] array, int n) {
        int answer = 0;
        for(int a:array){
            if(a==n) answer++;
        }
        return answer;
    }
}
