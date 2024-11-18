package javaStudy.day22;

import java.util.HashMap;
import java.util.Map;

public class MorseCode01 {
	public String solution(String letter) {
        String answer = "";
       String[] encrypted = letter.split(" ");
       String[] morsecode = {".-","-...","-.-.","-..",".","..-.", "--.","....","..",".---","-.-",
                             ".-..","--","-.","---", ".--.","--.-",".-.","...","-","..-","...-",
                             ".--","-..-", "-.--","--.."};
       Map<String,Character> morse = new HashMap<>();
       for(int i=0;i<morsecode.length;i++) {
       	morse.put(morsecode[i],(char)('a'+i));
       }
       for(String e:encrypted){
           answer += morse.get(e);
       }
       return answer;
   }
	
	public String otherSolution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] word = letter.split(" ");

        for(int i=0;i<word.length;i++){
            for(int j=0;j<morse.length;j++){
                if(word[i].equals(morse[j])) answer+=(char)(j+97);
            }
        }

        return answer;
    }
}
