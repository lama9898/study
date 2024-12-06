package javaStudy.day34;

public class StringArrayEquaslStringArray {
	//덜함
	public static void main(String[] args) {
		StringArrayEquaslStringArray test = new StringArrayEquaslStringArray();
		String[] cards1 = {"i", "water", "drink"};
		String[] cards2 = {"want", "to"};
		String[] goal = {"i", "want", "to", "drink", "water"};
		test.solution(cards1, cards2, goal);
	}
	
	public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int[] test = new int[goal.length];
        for(int i=0;i<goal.length;i++) {
        	for(int j=0;j<cards1.length;j++) {
        		if(cards1[j].equals(goal[i])) {
        			test[i]++;
        		}
        	}
        	for(int j=0;j<cards2.length;j++) {
        		if(cards2[j].equals(goal[i])) {
        			test[i]++;
        		}
        	}
        }
        for(int i =0;i<test.length;i++) {
        	if(test[i]==0) {
        		answer = "No";
        	}
        }
        return answer;
    }
}
