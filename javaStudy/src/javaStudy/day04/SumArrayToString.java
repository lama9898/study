package javaStudy.day04;


public class SumArrayToString {
    public static void main(String[] args) {

    	SumArrayToString test = new SumArrayToString();
    	String[] sample = {"a","b","c"};
    	System.out.println(test.solution(sample));
    }
    public String solution(String[] arr) {
        String answer = "";
//        for(int i=0;i<arr.length;i++) {
//        	answer = answer + arr[i];
//        }
        answer = String.join(answer, arr);
        //문자열 데이터를 결합 String.join("결합문자", 데이터1, 데이터2, ... );
        // 배열 데이터 결합시 사용 가능
        return answer;
    }

}
