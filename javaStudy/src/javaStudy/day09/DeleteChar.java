package javaStudy.day09;

public class DeleteChar {
	public static void main(String[] args) {

		DeleteChar test = new DeleteChar();
		int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
		test.solution("apporoograpemmemprs", arr);
	}
    public String solution(String my_string, int[] indices) {
        String answer = my_string;
        for(int i=0;i<indices.length;i++){
            answer = my_string.substring(0,indices[i])+my_string.substring(indices[i]+1);
            System.out.println(my_string.charAt(indices[i]));
            System.out.println(answer);
        }
        
        return answer;
    }
}
