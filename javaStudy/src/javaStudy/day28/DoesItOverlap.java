package javaStudy.day28;

//마저 해야함
public class DoesItOverlap {
	public int solution(int[][] lines) {
        int answer = 0;
        int smallest = 100;
        int largest = -100;
        int current = 0;
        for(int i=0;i<lines.length;i++){
            if(lines[i][0]<=smallest){
                smallest = lines[i][0];
            }
            if(lines[i][1]>=largest){
                largest = lines[i][1];
            }
        }
        current = smallest;
        while(current<=largest){
            for(int i=0;i<lines.length;i++){
                if(lines[i][0]==current){
                    int d = 0;
                    for(int j=0;j<lines.length;j++){ // 
                        if(i!=j && lines[j][0]==current){
                            d++;
                        }
                        current++;
                    }
                    // 이 루프 안에서 current 바꿔주기
                }
            }
        }
        
        return answer;
    }
}
