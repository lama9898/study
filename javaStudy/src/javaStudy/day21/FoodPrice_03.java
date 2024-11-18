package javaStudy.day21;

public class FoodPrice_03 {
	public static void main(String[] args) {
		FoodPrice_03 test = new FoodPrice_03();
		test.solution(10, 3);
	}
	public int solution(int n, int k) {
		int answer = 0;
        int drink=n/10>=1?n/10:0;
        
        if(k-drink==0) answer = n*12000;
        else answer = n*12000+(k-drink)*2000;
        
        return answer;
    }
}
