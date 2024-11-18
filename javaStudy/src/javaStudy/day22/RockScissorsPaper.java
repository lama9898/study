package javaStudy.day22;

public class RockScissorsPaper {
	public String solution(String rsp) {
		String answer = "";
		for (int i = 0; i < rsp.length(); i++) {
			int temp = rsp.charAt(i) - '0';
			if (temp == 0)
				answer += 5;
			else if (temp == 2)
				answer += 0;
			else
				answer += 2;
		}
		return answer;
	}
	
	public String otherSolution(String rsp) {
        return rsp.replaceAll("2", "9").replaceAll("5", "2").replaceAll("0", "5").replaceAll("9", "0");
    }
}
