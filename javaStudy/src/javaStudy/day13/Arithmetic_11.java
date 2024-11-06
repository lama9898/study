package javaStudy.day13;

public class Arithmetic_11 {
	public int plus(int num1, int num2) {
		int answer = num1 + num2;
		return answer;
	}

	public int minus(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}

	public int multiple(int num1, int num2) {
		int answer = num1 * num2;
		return answer;
	}

	public int divide(int num1, int num2) {
		int answer = num1 / num2;
		return answer;
	}

	public int float_divide(int num1, int num2) {
		int answer = (int) ((float) num1 / (float) num2);
		return answer;
	}

	public int leftover(int num1, int num2) {
		int answer = num1 % num2;
		return answer;
	}

	public int[] differNums(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		answer[0] = numer1 * denom2 + denom1 * numer2;
		answer[1] = denom1 * denom2;
		for (int i = 2; i < denom1; i++) {
			if (denom1 % i == 0 && answer[0] % i == 0) {
				answer[0] = answer[0] / i;
				answer[1] = answer[1] / i;
			}
		}
		for (int i = 2; i < denom2; i++) {
			if (denom2 % i == 0 && answer[0] % i == 0) {
				answer[0] = answer[0] / i;
				answer[1] = answer[1] / i;
			}
		}
		return answer;
	}

	public int[] doubletheElement(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < numbers.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return answer;
		//return Arrays.stream(numbers).map(i -> i * 2).toArray();
	}
}
