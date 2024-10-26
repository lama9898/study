package javaStudy.day05;


public class TFArithmeticSequence {
	public static void main(String[] args) {

		TFArithmeticSequence test = new TFArithmeticSequence();
		boolean[] included =  {true,false,false,true,true}; 
		System.out.println(test.solution(3, 4,included));
    }
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        // (a+(n-1)d) 의 sum
        for(int i=0;i<included.length;i++){
                answer += (included[i]?a+i*d:0);
        }
        return answer;
    }
}
