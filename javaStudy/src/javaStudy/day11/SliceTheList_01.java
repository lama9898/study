package javaStudy.day11;

public class SliceTheList_01 {
	public static void main(String[] args) {
		SliceTheList_01 test = new SliceTheList_01();
		int[] arr1 = {1, 5, 2};
		int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(test.mySolution(3, arr1, arr2));
	}
	//★★★★★★★★★★★★★★★★★★★★★★★★

	public int[] mySolution(int n, int[] slicer, int[] num_list) {
	    int[] answer = {};
	    switch(n) {
	        case 1:
	            answer = new int[slicer[1] + 1];
	            for (int i = 0; i <= slicer[1]; i++) {
	                answer[i] = num_list[i];
	            }
	            break;
	        case 2:
	            answer = new int[num_list.length - slicer[0]];
	            for (int i = 0; i < answer.length; i++) {
	                answer[i] = num_list[i + slicer[0]];
	            }
	            break;
	        case 3:
	            answer = new int[slicer[1] - slicer[0] + 1];
	            for (int i = 0; i < answer.length; i++) {
	                answer[i] = num_list[i + slicer[0]];
	            }
	            break;
	        case 4:
	            int length = ((slicer[1] - slicer[0]) / slicer[2]) + 1;
	            answer = new int[length];
	            for (int i = 0; i < length; i++) {
	                answer[i] = num_list[slicer[0] + i * slicer[2]];
	            }
	            break;
	    }
	    return answer;
	}
	
	public int[] otherSolution(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }

}
