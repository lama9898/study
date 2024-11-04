package javaStudy.day11;

public class FirstNegative_02 {
	public static void main(String[] args) {

	}

	public int mySolution(int[] num_list) {
		for (int i = 0; i < num_list.length; i++) {
			if (num_list[i] < 0)
				return i;
		}
		return -1;
	}

	public int otherSolution(int[] num_list) {
		for (int i = 0; i < num_list.length; i++)
			if (num_list[i] < 0)
				return i;
		return -1;
	}
}
