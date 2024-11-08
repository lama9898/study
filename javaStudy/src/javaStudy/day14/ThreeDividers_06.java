package javaStudy.day14;

import java.util.ArrayList;

public class ThreeDividers_06 { // ★★★★★★★★
	public static void main(String[] args) {

		ThreeDividers_06 test = new ThreeDividers_06();
		test.mySolution02("cabab");
	}

	public String[] mySolution01(String myStr) {
		ArrayList<String> answer = new ArrayList<>();
		int idx = -1;
		boolean wasABCBefore = false;
		for (int i = 0; i < myStr.length(); i++) {
			if (!(myStr.charAt(i) == 'a' || myStr.charAt(i) == 'b' || myStr.charAt(i) == 'c')) {
				if (wasABCBefore) {
					idx++;
					answer.add(idx, myStr.charAt(i) + "");
				} else {
					answer.set(idx, answer.get(idx) + myStr.charAt(i));
				}
				wasABCBefore = false;
			} else {
				wasABCBefore = true;
			}
		}
		if (answer.size() == 0)
			answer.add("EMPTY");
		return answer.toArray(new String[0]);
	}

	public String[] mySolution02(String myStr) {
		String[] sliced = myStr.replaceAll("[abc]{1,}", " ").trim().split("\\s");
        if (sliced[0].isEmpty()) {
            sliced[0] = "EMPTY";
        }
        return sliced;
	}
}
