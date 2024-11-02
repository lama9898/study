package javaStudy.day10;


public class EraseCharAtIndex_01 {
	// 문자열 my_string과 정수 배열 indices가 주어질 때,
	// my_string에서 indices의 원소에 해당하는 인덱스의 글자를 지우고
	// 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
	
	public static void main(String[] args) {
		EraseCharAtIndex_01 test = new EraseCharAtIndex_01();
		int[] arr = {1, 16, 6, 15, 0, 10, 11, 3};
		test.mySolution("apporoograpemmemprs", arr);
	}
    public void mySolution(String my_string, int[] indices) {
        String answer = my_string;
        for(int i=0;i<indices.length;i++){
            answer = answer.substring(0,indices[i])+" "+answer.substring(indices[i]+1);
            System.out.println(answer+'\n');
        }
        answer = answer.replaceAll("\\s", "");
        System.out.println(answer);
    }

    public String otherSolution(String my_string, int[] indices) {
    	String[] str = my_string.split("");
        for (int i=0;i<indices.length;i++) str[indices[i]] = "";
        return String.join("",str);
    }
}
