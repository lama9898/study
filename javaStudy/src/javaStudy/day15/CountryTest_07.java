package javaStudy.day15;

import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.IntStream;

public class CountryTest_07 { // ★★★★★★★★★★★★★★★★★★★★★★★
	public int mySolution01(int[] rank, boolean[] attendance) {
		int[] top = new int[3]; // 0,1,2 순으로 a,b,c
		int idx = 0; // top[idx]로 값 저장위해
		while (idx < 3) { // 3번 반복
			// 최소값 찾기, 최소값에 해당하는 i값 찾기, 3번 반복
			int min = 100; // 최소값을 위한 변수
			int minIdx = 100; // 최소값에 해당하는 i
			for (int i = 0; i < rank.length; i++) {
				// 최소값 찾기
				if (rank[i] < min && attendance[i]) { // 조건 : attendance=true
					min = rank[i];
					minIdx = i;
				}
			}
			top[idx] = minIdx;
			rank[minIdx] = 100;
			idx++;
		}

		return top[0] * 10000 + 100 * top[1] + top[2];
	}

	public int mySolution02(int[] rank, boolean[] attendance) {
		int idx = 0;
		int[] top = new int[3];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < rank.length; i++) {
			if (attendance[i]) {
				map.put(rank[i], i); // 등수,index
			}
		}
		for (int i = 0; idx < 3; i++) {
			if (map.containsKey(i)) {
				top[idx] = map.get(i);
				idx++;
			}
		}
		return top[0] * 10000 + 100 * top[1] + top[2];
	}
	
	public int otherSolution(int[] rank, boolean[] attendance) {
        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .boxed()
                .sorted(Comparator.comparing(i -> rank[i]))
                .limit(3L)
                .reduce((current, next) -> current * 100 + next)
                .get();
    }
}
	
	/*
		0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다. 등수가 높은 3명을 선발해야 하지만,
		개인사정으로 전국 대회에 참여하지 못하는 학생들이 있어 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
		
		각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴 boolean 배열 attendance가
		매개변수로 주어집니다. 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때 10000 × a +
		100 × b + c를 return 하는 solution 함수를 작성해 주세요.
	*/