//#05
package javaStudy.day09;

public class QRcode {
	public static void main(String[] args) {

	}
	public String mySolution(int q, int r, String code) {
        String answer = "";
        for(int i=0;i<code.length();i++){
            if(i%q==r) answer += code.charAt(i);
        }
        return answer;
	}
}