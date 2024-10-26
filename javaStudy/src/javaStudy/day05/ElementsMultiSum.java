package javaStudy.day05;

public class ElementsMultiSum {
	public static void main(String[] args) {

	}
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for(int num : num_list){
            multi *= num;
            sum += num;
        }
        answer = (multi)<(sum*sum)? 1 : 0;
        return answer;
        /*
        int sum = Arrays.stream(num_list).reduce(Integer::sum).getAsInt();
        int product = Arrays.stream(num_list).reduce((i,j)->i*j).getAsInt();
        return product < sum*sum ? 1 : 0;
         */
        //제곱은 pow로 이용하기
    }
}
