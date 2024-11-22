package javaStudy.day26;

import java.util.HashMap;
import java.util.Set;

public class NumOfDivisor {
	public int solution(int left, int right) {
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = left; i <= right; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			map.put(i, count);
		}
		Set<Integer> set = map.keySet();
		for (int i : set) {
			if (map.get(i) % 2 == 0)
				answer += i;
			else
				answer -= i;
		}
		return answer;
	}
	
	public int otherSolution(int left, int right) {
        int answer = 0;

        for (int i=left;i<=right;i++) {
            //제곱수인 경우 약수의 개수가 홀수
            if (i % Math.sqrt(i) == 0) {
                answer -= i;
            }
            //제곱수가 아닌 경우 약수의 개수가 짝수
            else {
                answer += i;
            }
        }

        return answer;
    }
}
