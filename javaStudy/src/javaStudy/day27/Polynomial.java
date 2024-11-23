package javaStudy.day27;
//다시보기

public class Polynomial {
	public static void main(String[] args) {
		Polynomial test = new Polynomial();
		test.wrongSolution("3x + 7 + x");
	}

	public String wrongSolution(String polynomial) {
		String answer = "";
		String[] maths = polynomial.split(" ");
		int sum = 0, xsum = 0;

		for (int i = 0; i < maths.length; i++) {
			if (maths[i].contains("x")) {
				if (maths[i].length() == 1) {
					xsum++;
				} else {
					xsum += Integer.parseInt(maths[i].substring(0, maths[i].indexOf("x")));
				}
			} else if (!maths[i].equals("+")) {
				sum += Integer.parseInt(maths[i]);
			}
		}

		if (xsum == 0 && sum == 0) {
			answer = "0";
		} else if (xsum == 0) {
			answer = sum + "";
		} else if (sum == 0) {
			answer = xsum == 1 ? "x" : xsum + "x";
		} else {
			if (maths[0].contains("x")) {
				answer = xsum == 1 ? "x + " + sum : xsum + "x + " + sum;
			} else {
				answer = xsum == 1 ? sum + " + x" : sum + " + " + xsum + "x";
			}
		}
		return answer;
	}

	public String solution(String polynomial) {
		String answer = "";
		String[] maths = polynomial.split(" ");
		int sum = 0, xsum = 0;

		for (String term : maths) {
			if (term.contains("x")) {
				if (term.equals("x")) { // 계수가 생략된 경우
					xsum += 1;
				} else { // 계수가 있는 경우
					xsum += Integer.parseInt(term.substring(0, term.indexOf("x")));
				}
			} else if (!term.equals("+")) { // 상수 항인 경우
				sum += Integer.parseInt(term);
			}
		}

		// 결과 조합
		if (xsum == 0 && sum == 0) {
			return "0"; // 모두 0인 경우
		} else if (xsum == 0) {
			return String.valueOf(sum); // 상수 항만 있는 경우
		} else if (sum == 0) {
			return xsum == 1 ? "x" : xsum + "x"; // x 항만 있는 경우
		} else {
			return (xsum == 1 ? "x" : xsum + "x") + " + " + sum; // x 항 + 상수 항
		}
	}
}
