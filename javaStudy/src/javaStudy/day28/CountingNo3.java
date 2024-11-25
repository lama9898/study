package javaStudy.day28;

public class CountingNo3 {
	public static void main(String[] args) {
		CountingNo3 test = new CountingNo3();
		test.solution(40);
	}
	public int solution(int n) {
		int answer = 0;
		int count = 0;
		int i = 0;
		while (count != n) {
			i++;
			String no3 = i+"";
			if (i % 3 != 0 && !no3.contains("3")) {
				count++;
				System.out.println(i+" - "+count);
			}
		}
		answer = i;
		return answer;
	}
}
