package javaStudy.day27;

public class WASD {
	public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for(int i=0;i<keyinput.length;i++){
            String key = keyinput[i];
			if (key.equals("up")) {
				if (answer[1] < (board[1] / 2)) {
					answer[1]++;
				}
			}
			else if (key.equals("down")) {
				if (answer[1] > (board[1] / 2) * (-1)) {
					answer[1]--;
				}
			}
			else if (key.equals("left")) {
				if (answer[0] > (board[0] / 2) * (-1)) {
					answer[0]--;
				}
			}
			else if (key.equals("right")) {
				if (answer[0] < (board[0] / 2)) {
					answer[0]++;
				}
			}
        }
        return answer;
    }
}
