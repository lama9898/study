package javaStudy.day05;

public class ChangeModeAndReturn {

	public static void main(String[] args) {
		ChangeModeAndReturn test = new ChangeModeAndReturn();
		test.solution("abc1abc1abc");
	}
	
	public String solution(String code) {
        String answer = "";
        // 코드 앞에서 부터 읽기
            // 문자가 1이면 mode 바꿈
        // mode에 따라 ret을 만듦 - 0/1, 0으로 시작
        // ret가 빈 문자열이면 "EMPTY" 반환
        int mode = 0;
        String ret = "";
        for(int i=0;i<code.length();i++){
        	switch(mode) {
        	case 0:
        		if(code.charAt(i)=='1') mode=1;
        		else ret = ret+ (i%2==0 ?code.charAt(i):"");
        		break;
        	case 1:
        		if(code.charAt(i)=='1') mode=0;
        		else ret = ret+ (i%2==1 ?code.charAt(i):"");
        		break;
        	}
        }
        if(ret.trim().length()==0) ret = "EMPTY";
        answer = ret;
        return answer;
        
        /* 더 좋은 방법
        	char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                answer.append(current);
            }
         */
    }
}
