package javaStudy.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFrequentValue {
	public int solution(int[] array) {
		int answer = 0;
		int max = 0;
		boolean only = true;
		Map<Integer, Integer> freq = new HashMap<>();
		for (int i = 0; i < array.length; i++) {
			if (freq.containsKey(array[i])) {
				freq.replace(array[i], freq.get(array[i]) + 1);
			} else {
				freq.put(array[i], 1);
			}
		}

		Set<Integer> keys = freq.keySet();
		for (int k : keys) {
			if (freq.get(k) > max) {
				max = freq.get(k);
				answer = k;
				only = true;
			} else if (freq.get(k) == max) {
				only = false;
			}
		}
		answer = !only ? -1 : answer;
		return answer;
	}
	
	public int otherSolution(int[] array) {
        int maxCount = 0;
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;
            if(count > maxCount){
                maxCount = count;
                answer = number;
            }
            else  if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }
}
