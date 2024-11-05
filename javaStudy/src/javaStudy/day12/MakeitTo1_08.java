package javaStudy.day12;

public class MakeitTo1_08 {
	public static void main(String[] args) {

		MakeitTo1_08 test = new MakeitTo1_08();
		int[] arr = { 12, 4, 15, 1, 14 };
		System.out.println(test.mySolution(arr));
	}

	public int mySolution(int[] num_list) {
		int answer = 0;
		int[] arr = num_list.clone();
		for (int i = 0; i < arr.length; i++) {
			while (arr[i] != 1) {
				if (arr[i] % 2 == 0) {
					arr[i] = arr[i] / 2;
					answer++;
				} else {
					arr[i]--;
					arr[i] = arr[i] / 2;
					answer++;
				}
			}
		}
		return answer;
	}
	
	public int otherSolution(int[] num_list) {
        int answer = 0;
        for(int i = 0;num_list.length>i;i++){
            while(num_list[i]!=1){
                num_list[i]/=2;
                answer++;
            }
        }
        return answer;
    }
}
