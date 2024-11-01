package javaStudy.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day08 {
	public static void main(String args[]) {
		
	}
	
	public int diceGame03(int a, int b, int c, int d) {
		int answer=0;
		// 정렬 후 크기 비교
		int[] dice = {a,b,c,d};
		int diff = 0;
		int diff2 = 0;
		
		Arrays.sort(dice); // inplace 방식

		// 모두 같으면 1111*p
		// 3,1 (10*p+q)^2
		// 2,2 (p+q)*(|p-q|)
		// 2,1,1 q*r
		// 1,1,1,1 min  == dice[0]
		
		for(int i=1;i<dice.length;i++) {
			if(dice[0]!=dice[i]) {
				diff++;
			}
		}
		
		if(diff==0) { // 다른적이 없었다. 모두 같다 			
			answer = 1111 * dice[0];
		}
		else if(diff==1) { // 한번 달랐다. (3,1) : (0,0,0,1) (정렬된 상태이기 떄문)
			answer = (int)Math.pow(10*dice[0]+dice[3],2);
		}
		else if(diff==2) { // 두번 달랐다. (2,2), (2,1,1)
			if(dice[2]==dice[3]) { // (1,1,2,2)
				answer = (dice[0]+dice[2]) * Math.abs(dice[0]-dice[2]);
			}
			else { // (1,1,2,3)
				answer = (dice[2]*dice[3]);
			}
		}
		else if(diff==3) { // 세번 달랐다. (1,1,1,1), (0,3), (1,1,2)
			if(dice[1]==dice[3]) { // (0,3), (1,2,2,2)
				answer = (int)Math.pow(10*dice[3]+dice[0],2);
			}
			else if(dice[1]==dice[2]) { // (1,1,2), (1,2,2,3)
				answer = dice[0]*dice[3];
			}
			else if(dice[2]==dice[3]) { // (1,1,2), (1,2,3,3)
				answer = dice[0]*dice[1];
			}
			else {
				answer = dice[0];
			}
		}
		
		return answer;
	}
	
	public int[] makeArray05(String[] intStrs, int k, int s, int l) {
		List<Integer> answer = new ArrayList<Integer>();
		for(String str:intStrs) {
			int temp = Integer.parseInt(str.substring(s, s+l));
			if(temp>k) answer.add(temp);
		}
        return answer.stream().mapToInt(Integer::intValue).toArray();
	}
	
	public String subStringConcatanate(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i=0;i<my_strings.length;i++){
            int s = parts[i][0];
            int e = parts[i][1];
            answer += my_strings[i].substring(s,e+1);
        }
        return answer;
    }
	
    public String wordsFromEnd(String my_string, int n) {
        return my_string.substring(my_string.length()-n,my_string.length());
    }
    
    public String[] suffixArray(String my_string) {
        String[] answer = new String[my_string.length()];
        for(int i=0;i<my_string.length();i++){
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
    
    public int isSuffix(String my_string, String is_suffix) {
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
        /*
        if(my_string.endsWith(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
         */
    }
}
