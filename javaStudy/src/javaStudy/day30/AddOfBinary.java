package javaStudy.day30;

public class AddOfBinary {
	public static void main(String[] args) {
		AddOfBinary test = new AddOfBinary();
		test.solution("1001", "1111");
	}

	public String solution(String bin1, String bin2) {
		String answer = "";
		String shorter = bin1.length() < bin2.length() ? bin1 : bin2;
		String longer = bin1.length() >= bin2.length() ? bin1 : bin2;
		boolean up = false;

		// 두 이진수를 뒤에서부터 더하기
		for (int i = 0; i < shorter.length(); i++) {
			int n1 = shorter.charAt(shorter.length() - 1 - i) - '0';
			int n2 = longer.charAt(longer.length() - 1 - i) - '0';
			int sum = n1 + n2 + (up ? 1 : 0);
			up = sum >= 2;
			answer = (sum % 2) + answer;
		}

		// 더 긴 이진수의 나머지 처리
		for (int i = shorter.length(); i < longer.length(); i++) {
			int n = longer.charAt(longer.length() - 1 - i) - '0';
			n += (up ? 1 : 0);
			up = n >= 2;
			answer = (n % 2) + answer;
		}

		// 마지막 캐리가 남아있는 경우 처리
		if (up) {
			answer = "1" + answer;
		}

		return answer;
	}
	
	public String otherSolution(String bin1, String bin2) {
	    // 이진수를 10진수로 변환
	    int num1 = Integer.parseInt(bin1, 2);
	    int num2 = Integer.parseInt(bin2, 2);

	    // 두 수의 합 계산
	    int sum = num1 + num2;

	    // 합을 다시 이진수로 변환
	    return Integer.toBinaryString(sum);
	}
}
