package javaStudy.day05;

public class Last2Element {
	public static void main(String[] args) {
		
	}
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        if(num_list[num_list.length-1]>num_list[num_list.length-2])
        	answer[num_list.length] = answer[answer.length-2] - answer[answer.length-3];
        else
        	answer[num_list.length] = answer[answer.length-2]*2;
        return answer;
    }
}
