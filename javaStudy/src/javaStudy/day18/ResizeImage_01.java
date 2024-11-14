package javaStudy.day18;

public class ResizeImage_01 { // ★★★★★★★★★★★★★★★★★★★★★★★★
	public static void main(String[] args) {
		ResizeImage_01 test = new ResizeImage_01();
		String[] arr = { ".xx...xx.", "x..x.x..x", "x...x...x", ".x.....x.", "..x...x..", "...x.x...", "....x...." };
		test.mySolution(arr, 2);
	}

	public String[] mySolution(String[] picture, int k) {
		String[] answer = new String[picture.length * k];
		int idx = 0;
		for (int i = 0; i < picture.length; i++) {
			String row = "";
			for (int j = 0; j < picture[i].length(); j++) {
				String token = "";
				for (int tk = 0; tk < k; tk++) {
					token += picture[i].charAt(j);
				}
				row += token;
			}
			for (int tk = 0; tk < k; tk++) {
				answer[idx] = row;
				idx++;
			}
		}
		return answer;
	}
}
