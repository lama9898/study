//#02
package javaStudy.day09;

public class PrefixOrNot {
	public static void main(String[] args) {

	}

	public int isPrefix01(String my_string, String is_prefix) {
		if(my_string.startsWith(is_prefix)) return 1;
		else return 0;
	}

	public int isPrefix02(String my_string, String is_prefix) {
		String[] prefix = new String[my_string.length()];
		for(int i=0;i<my_string.length();i++) {
			prefix[i] = my_string.substring(0,i);
			if(prefix[i].equals(is_prefix)) return 1;
		}
		
		return 0;
	}
}
