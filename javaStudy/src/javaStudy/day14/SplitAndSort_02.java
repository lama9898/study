package javaStudy.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitAndSort_02 { // ★★★★★★★★★★★★★★★★★★★★
	public static void main(String[] args) {
		String[] answer = "dxccxbbbxxaaaa".split("x");
		for(String a:answer) {
			System.out.println(a);
		}
	}
	public String[] mySolution01(String myString) { // too slow
		String[] answer = myString.split("x");
        for(int i=0;i<answer.length;i++){
            for(int j=0;j<answer.length-i;j++){
                if(answer[i].charAt(0)>answer[j].charAt(0)){
                    String temp = answer[j];
                    answer[j] = answer[i];
                    answer[i] = temp;
                }
                else if(answer[i].charAt(0)==answer[j].charAt(0)){
                    int length = answer[i].length()>answer[j].length()?answer[j].length():answer[i].length();
                    for(int k=1;k<length;k++){
                        if(answer[j].charAt(k)>answer[i].charAt(k)){
                            String temp = answer[j];
                            answer[j] = answer[i];
                            answer[i] = temp; 
                            break;
                        }
                    }
                }
            }
        }
        
        return answer;
	}
	
	public String[] mySolution02(String myString) { //too slow2
		String[] answer = myString.split("x");
        String temp ="";
        for(int i=0;i<answer.length-1;i++){
            for(int j=i+1;j<answer.length;j++){
                if(sortAlphabet(answer[i],answer[j])==1){
                    temp = answer[j];
                    answer[j] = answer[i];
                    answer[i] = temp;
                }
            }
        }
        
        return answer;
    }
    
    public int sortAlphabet(String a, String b){
        if(a.charAt(0)<b.charAt(0))
            return 0; // no need to change
        else if(a.charAt(0)==b.charAt(0)){
            return sortAlphabet(a.substring(1),b.substring(1));
        }
        else
            return 1; //need to change
    }
    
    ///////////////
    
    public String[] solution(String myString) {
		String[] xlice = myString.split("x");
        String[] answer = {};
        ArrayList<String> slices = new ArrayList<>();
        for(String s:xlice){
            if(!s.isEmpty()) slices.add(s);
        }
        answer = slices.toArray(new String[0]);
        Arrays.sort(answer);
        
        return answer;
    }
    
    //
    public String[] otherSolution01(String myString) {
        StringTokenizer st = new StringTokenizer(myString, "x");
        int idx = 0, N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[idx++] = st.nextToken();
        Arrays.sort(result);
        return result;
    }
}
