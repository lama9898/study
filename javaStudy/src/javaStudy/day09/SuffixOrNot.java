//#01
package javaStudy.day09;

public class SuffixOrNot {
	public static void main(String[] args) {

	}

	public int isSuffix01(String my_string, String is_suffix) {
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
	}

	public int isSuffix02(String my_string, String is_suffix) {
        int answer = 0;
        String[] strings = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            strings[i] = my_string.substring(i);
        }
        for(String s:strings){
            if(s.equals(is_suffix)){
                answer = 1;
                break;
            }
        }
        return answer;
	}
}
