package javaStudy.day12;

public class TodoList_03 {
	public String[] mySolution(String[] todo_list, boolean[] finished) {
		String[] answer = {};
		int count = 0;
		for (int i = 0; i < finished.length; i++) {
			if (!finished[i]) { // 미완료
				count++;
			}
		}
		answer = new String[count];
		for (int i = todo_list.length - 1; i >= 0; i--) {
			if (!finished[i]) {
				answer[count - 1] = todo_list[i];
				count--;
			}
		}
		return answer;
	}

	public String[] otherSolution(String[] todo_list, boolean[] finished) {
		String str = "";
		for (int i = 0; i < finished.length; i++) {
			str = finished[i] == false ? str + todo_list[i] + "," : str;
		}
		return str.split(",");
	}

}
