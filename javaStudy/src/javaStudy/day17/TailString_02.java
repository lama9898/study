package javaStudy.day17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TailString_02 {
	public String mySolution(String[] str_list, String ex) {
		String answer = "";
		for (String str : str_list) {
			if (!str.contains(ex))
				answer += str;
		}
		return answer;
	}
	public String otherSolution(String[] strList, String ex) {
        return Arrays.stream(strList).filter(s -> !s.contains(ex)).collect(Collectors.joining());
    }
}
