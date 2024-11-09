package javaStudy.day15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClusterStrings_03 {
	public static void main(String[] args) {
		ClusterStrings_03 test = new ClusterStrings_03();
		String[] arr = { "a", "bc", "d", "efg", "hi" };
		test.mySolution(arr);
	}

	public int mySolution(String[] strArr) {
		Map<Integer, Integer> sizes = new HashMap<>();
		int answer = 1;
		for (int i = 0; i < strArr.length; i++) {
			if (sizes.containsKey(strArr[i].length())) {
				sizes.put(strArr[i].length(), sizes.get(strArr[i].length()) + 1);
			} else {
				sizes.put(strArr[i].length(), 1);
			}
		}
		for (Integer i : sizes.keySet()) {
			if (answer < sizes.get(i)) {
				answer = sizes.get(i);
			}
		}

		return answer;
	}
	
	public int otherSolution(String[] strArr) {

        int[] counter = new int[31];

        for (String str : strArr) {
            counter[str.length()]++;
        }

        return Arrays.stream(counter).max().getAsInt();
    }

}
