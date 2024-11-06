package javaStudy.day13;

public class CountHowManySubstring_07 {
	public int mySolution(String myString, String pat) {
		int answer = 0;
		for (int i = 0; i <= myString.length() - pat.length(); i++) {
			if (myString.substring(i, i + pat.length()).contains(pat)) {
				answer++;
			}
		}
		return answer;
	}
	
	public int otherSolution(String myString, String pat) {
        int cnt = 0;
        for(int i=0; i<myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                cnt++;
            }
        }
        return cnt;
    }
}
