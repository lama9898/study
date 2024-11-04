package javaStudy.day11;

public class ChangeOrder_07 {
	public static void main(String[] args) {
		ChangeOrder_07 test = new ChangeOrder_07();
		int[] arr = { 5, 2, 1, 7, 5 };
		test.mySolution(arr, 3);
	}

	public int[] fail(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
		int[] after = new int[num_list.length - n];
		int[] before = new int[n];
		for (int i = 0; i < num_list.length; i++) {
			if (i <= num_list.length - n) {
				after[i] = num_list[i + n];
			} else {
				before[i] = num_list[num_list.length - n + i - 1];
			}
		}
		return answer;
	}

	public int[] mySolution(int[] num_list, int n) {
		int[] answer = new int[num_list.length];
        for(int i=0;i<num_list.length-n;i++){
            answer[i] = num_list[n+i];
        }
        for(int i=0;i<n;i++){
            answer[num_list.length-n+i] = num_list[i];
        }
        return answer;
	}

	public int[] otherSolution(int[] num_list, int n) {
		int idx = 0;
		int[] answer = new int[num_list.length];
		for (int i = n; i < num_list.length; i++)
			answer[idx++] = num_list[i];
		for (int i = 0; i < n; i++)
			answer[idx++] = num_list[i];
		return answer;
	}
}
