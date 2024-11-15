package javaStudy.day19;

public class VideoPlayer {
	public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
		String answer = "";
		int current = toSec(pos);
		int opstart = toSec(op_start);
		int opend = toSec(op_end);
		int full = toSec(video_len);
		for (int i = 0; i < commands.length; i++) {
			if (current >= opstart && current <= opend) {
				current = opend;
			}
			if (commands[i].equals("prev")) {
				current -= 10;
				if (current <= 0)
					current = 0;
			} else if (commands[i].equals("next")) {
				current += 10;
				if (current >= full)
					current = full;
			}
			if (current >= opstart && current <= opend) {
				current = opend;
			}
		}
		answer = toTime(current);
		return answer;
	}

	public int toSec(String time) {
		int min = Integer.parseInt(time.split(":")[0]);
		int sec = Integer.parseInt(time.split(":")[1]);
		int result = min * 60 + sec;
		return result;
	}

	public String toTime(int sec) {
		String result = "";
		if (sec / 60 <= 0) { // 초만 있는 경우
			result = sec > 9 ? "00:" + sec : "00:0" + sec;
		} else {
			result = sec / 60 < 10 ? "0" + sec / 60 + ":" : sec / 60 + ":";
			result += sec % 60 < 10 ? "0" + sec % 60 : sec % 60;
		}
		return result;
	}
}
