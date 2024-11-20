package javaStudy.day24;

public class ClosestNumber {
	public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0]-n);

        for(int i=1;i<array.length;i++){
            int diff = Math.abs(array[i]-n);
            if(diff<min){
                min = diff;
                answer = array[i];
            }
            else if(diff==min){
                answer = array[i]>answer?answer:array[i];
            }
        }

        return answer;
    }
}
