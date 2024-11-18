package javaStudy.day22;

public class AntArmy { //i'am idiota
	public static void main(String[] args) {
		AntArmy test = new AntArmy();
		System.out.println(test.solution(7));
	}

	public int bad(int hp) {
		int answer = 0;
		int general = 0, soldier = 0, work = 0; // 5,3,1
		if (hp == 0)
			return 0;
		if (hp % 5 == 0) {
			answer = hp / 5;
		} else {
			general = hp / 5;
			if (hp % 5 >= 3) { // 3,4
				soldier = 1;
				work = hp % 5 - 3;
			} else {
				soldier = 0;
				work = hp % 5;
			}
		}
		answer = general + soldier + work;
		return answer;
	}

	public int solution(int hp) {
		int general = hp / 5;
		int soldier = hp % 5 / 3;
		int work = hp % 5 % 3; // 5,3,1
		return general + soldier + work;
	}
}
