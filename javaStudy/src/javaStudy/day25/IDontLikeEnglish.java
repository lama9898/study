package javaStudy.day25;

public class IDontLikeEnglish {
	public long solution(String numbers) {
		long answer = 0;
		String number = "";
		String numbersSub = numbers;
		while (numbersSub.length() > 0) {
			String temp = numbersSub.substring(0, 3);
			if (temp.equals("zer")) {
				number += "0";
				numbersSub = numbersSub.substring(4);
			} else if (temp.equals("one")) {
				number += "1";
				numbersSub = numbersSub.substring(3);
			} else if (temp.equals("two")) {
				number += "2";
				numbersSub = numbersSub.substring(3);
			} else if (temp.equals("thr")) {
				number += "3";
				numbersSub = numbersSub.substring(5);
			} else if (temp.equals("fou")) {
				number += "4";
				numbersSub = numbersSub.substring(4);
			} else if (temp.equals("fiv")) {
				number += "5";
				numbersSub = numbersSub.substring(4);
			} else if (temp.equals("six")) {
				number += "6";
				numbersSub = numbersSub.substring(3);
			} else if (temp.equals("sev")) {
				number += "7";
				numbersSub = numbersSub.substring(5);
			} else if (temp.equals("eig")) {
				number += "8";
				numbersSub = numbersSub.substring(5);
			} else if (temp.equals("nin")) {
				number += "9";
				numbersSub = numbersSub.substring(4);
			}
		}
		answer = Long.parseLong(number);
		return answer;
	}

	public long otherSolution(String numbers) {

		String[] numbers_arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		for (int i = 0; i < numbers_arr.length; i++) {
			numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
		}

		long answer = Long.parseLong(numbers);
		return answer;
	}
}
