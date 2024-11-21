package javaStudy.day25;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class WhatAppearedOnce {
	public String solution01(String s) {
		String answer = "";
		HashMap<Character, Integer> map = new HashMap<>();
		for (char c : s.toCharArray()) {
			if (map.containsKey(c))
				map.put(c, map.get(c) + 1);
			else
				map.put(c, 1);
		}
		Set<Character> keys = map.keySet();
		for (char key : keys) {
			if (map.get(key) == 1)
				answer += key;
		}
		return answer;
	}
	
	public String solution(String s) {
        String answer = "";
        char[] array = {};
        for(int i=0;i<s.length();i++){
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
                answer += s.charAt(i);
        }
        array = answer.toCharArray();
        Arrays.sort(array);
        answer = String.valueOf(array);
        
        return answer;
    }
	
	
}
