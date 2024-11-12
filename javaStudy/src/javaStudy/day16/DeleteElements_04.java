package javaStudy.day16;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class DeleteElements_04 {
	public int[] mySolution(int[] arr, int[] delete_list) {
		ArrayList<Integer> answer = new ArrayList<>();
		ArrayList<Integer> delete = new ArrayList<>();
		for (int a : arr) {
			answer.add(a);
		}
		for (int d : delete_list) {
			delete.add(d);
		}
		answer.removeAll(delete);
		return answer.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] otherSolution(int[] arr, int[] delete_list) {
		return IntStream.of(arr).filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i)).toArray();
	}
}
