//#04
package javaStudy.day09;

public class ReadInVertical {
	public static void main(String[] args) {

	}
    public String mySolution(String my_string, int m, int c) {
        String answer = "";
        int n = my_string.length()/m; // 몇줄이 나오는지 : 각 줄의 c번째 : my_string[c+m];
        for(int i=0;i<n;i++){
            answer += my_string.charAt((c-1)+m*i);
        }
        return answer;
    }
    public String otherSolution(String my_string, int m, int c) {
        String answer = "";

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
}
