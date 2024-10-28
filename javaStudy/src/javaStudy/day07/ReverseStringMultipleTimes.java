package javaStudy.day07;

public class ReverseStringMultipleTimes {
	public static void main(String[] args) {

	}
    public String solution(String my_string, int[][] queries) {
    	// 다른 방법 : arr = my_string.toCharArray();
        StringBuffer answer = new StringBuffer();
        answer.append(my_string);
        for(int i=0;i<queries.length;i++){
            int s = queries[i][0];
            int e = queries[i][1];
            
            while(s<e) {
            	char temp = answer.charAt(s);
            	answer.setCharAt(s, answer.charAt(e));
            	answer.setCharAt(e, temp);
            	s++; e--;
            }
        }
        
        return answer.toString();
    }
}
