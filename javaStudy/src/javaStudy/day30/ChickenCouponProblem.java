package javaStudy.day30;

public class ChickenCouponProblem {
	public int solution(int chicken) {
		int answer = 0;
		int coupon = chicken;
		while (coupon / 10 > 0) {
			answer = answer + coupon / 10;
			coupon = coupon / 10 + coupon % 10;
		}
		return answer;
	}
}
