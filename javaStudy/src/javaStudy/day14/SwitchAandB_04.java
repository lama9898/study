package javaStudy.day14;

public class SwitchAandB_04 {
	public int mySolution(String myString, String pat) {
		String switched = "";
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == 'A')
				switched += "B";
			else
				switched += "A";
		}
		int answer = switched.contains(pat) ? 1 : 0;
		return answer;
	}
	public int otherSolution(String myString, String pat) {
        myString = myString.replace("A", "a").replace("B", "A").replace("a", "B");
        return myString.contains(pat) ? 1 : 0;
    }
}
