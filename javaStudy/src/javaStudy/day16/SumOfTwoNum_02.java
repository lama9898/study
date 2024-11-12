package javaStudy.day16;

import java.math.BigInteger;

public class SumOfTwoNum_02 {
	public static void main(String[] args) {
		SumOfTwoNum_02 test = new SumOfTwoNum_02();

		System.out.println(test.solution("1", "999"));
	}

	public String solution(String a, String b) {
		String answer = "";
		int shorter = a.length() >= b.length() ? b.length() : a.length();
		String longer = a.length() >= b.length() ? a : b;
		boolean up = false;
		for (int i = 1; i <= shorter; i++) {
			int sum = (a.charAt(a.length() - i) - '0') + (b.charAt(b.length() - i) - '0');
			if (up)
				sum++;
			if (sum >= 10) {
				up = true;
				sum -= 10;
			} else {
				up = false;
			}
			answer = sum + answer;
		}
		if (shorter != longer.length()) {
			System.out.println("check1");
			for (int i = 1; i <= longer.length() - shorter; i++) {
				int sum = longer.charAt(longer.length() - shorter - i) - '0'; // 해당 자리의 값
				if (up) {
					sum++;
				}
				if (sum >= 10) {
					up = true;
					sum -= 10;
				} else {
					up = false;
				}
				answer = sum + answer;
				if (i == longer.length() - shorter && up)
					answer = "1" + answer;
			}
		} else {
			if (up) {
				answer = "1" + answer;
			}
		}

		return answer;
	}
	
	public String otherSolution01(String a, String b) {
        String answer = "";

        BigInteger A = new BigInteger(a);
        BigInteger B = new BigInteger(b);

        answer += A.add(B);

        return answer;
    }
	
	public String otherSolution02(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }
}

/*
 * 0 이상의 두 정수가 문자열 a, b로 주어질 때, a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.
 */