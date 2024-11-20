package javaStudy.day24;

import java.util.HashMap;

public class RemoveDuplicated {
    public String solution(String my_string) {
        String answer = "";
        HashMap<Character,Integer> map = new HashMap<>();
        char[] cs = my_string.toCharArray();
        for(int i=0;i<cs.length;i++) {
        	if(!map.containsKey(cs[i])) {
        		map.put(cs[i],i);
        		answer = answer+ cs[i];
        	}
        }
        return answer;
    }
    
    public String otherSolution(String my_string) {
        String answer = "";

        for(int i=0; i<my_string.length(); i++){
            if(i==my_string.indexOf(my_string.charAt(i)))
                answer+=my_string.charAt(i);
        }

        return answer;
    }
}
