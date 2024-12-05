package javaStudy.day33;

public class FoodFight {
	public String solution(int[] food) {
		String answer = "";
		String left = "", right = "";
		int[] dish = new int[food.length];
		dish[0] = 1;
		for (int i = 1; i < food.length; i++) {
			dish[i] = food[i] / 2;
		}
		for (int i = 1; i < dish.length; i++) {
			for (int j = 0; j < dish[i]; j++) {
				left = left + i;
				right = i + right;
			}
		}
		answer = left + "0" + right;
		return answer;
	}

	public String otherSolution(int[] food) {
		String answer = "0";

		for (int i = food.length - 1; i > 0; i--) {
			for (int j = 0; j < food[i] / 2; j++) {
				answer = i + answer + i;
			}
		}

		return answer;
	}
}
