package javaStudy.day14;

import java.util.ArrayList;
import java.util.Arrays;

public class PickRandomNumOfK_10 {
	public static void main(String[] args) {

//		System.out.println((Math.random() * 10)); //0~9.9999
		PickRandomNumOfK_10 test = new PickRandomNumOfK_10();
		int[] arr = {1,2,3,4};
		for(int i:test.mySolution(arr, 4)) {
			System.out.print(i);
		}
	}

	public int[] wrong(int[] arr, int k) {
		int[] answer = new int[k]; //답 반환
        Arrays.fill(answer,-1); // k보다 작으면 -1로 채워놓기
        
        int idx = 0;	// answer index용
        String array ="";	//지금까지 나온적없는 수인지 확인용 string
        
        for(int i=0;i<arr.length;i++){
        	// array. contains 확인해서 있는 지 없는지 확인
        	String temp = " "+arr[i];
        	System.out.println(temp);
            if(!array.contains(temp)){ //없는 경우에만 추가
                answer[idx] = arr[i];
            	array = array+temp;
            	System.out.println("===="+array);
                idx++;
                if(idx==k) break;
            }
        }
        return answer;
	}
	
	 public int[] mySolution(int[] arr, int k) {
	        int[] answer = new int[k];
	        int index =0;
	        Arrays.fill(answer,-1);
	        for(int i=0;i<arr.length;i++){
	            boolean exist = false;
	            for(int j=0;j<answer.length;j++){
	                if(arr[i]==answer[j])
	                    exist = true;
	            }
	            if(!exist){
	                answer[index] = arr[i];
	                index++;
	                if(index==k) break;
	            }
	        }
	        
	        return answer;
	    }
	 
	 public int[] otherSolution(int[] arr, int k) {
	        ArrayList<Integer> arrayList = new ArrayList<>();

	        for (int a : arr)
	            if (!arrayList.contains(a))
	                arrayList.add(a);

	        int idx = 0;
	        int[] answer = new int[k];
	        for (int i = 0;i < k;i++)
	            answer[i] = -1;
	        for (int i = 0;i < k && i < arrayList.size();i++)
	            answer[i] = arrayList.get(i);
	        return answer;
	    }

}
/*
	랜덤으로 서로 다른 k개의 수를 저장한 배열을 만드려고 합니다. 적절한 방법이 떠오르지 않기 때문에 일정한 범위 내에서 무작위로 수를 뽑은 후, 지금까지 나온적이 없는 수이면 배열 맨 뒤에 추가하는 방식으로 만들기로 합니다.
	
	이미 어떤 수가 무작위로 주어질지 알고 있다고 가정하고, 실제 만들어질 길이 k의 배열을 예상해봅시다.
	
	정수 배열 arr가 주어집니다. 문제에서의 무작위의 수는 arr에 저장된 순서대로 주어질 예정이라고 했을 때, 완성될 배열을 return 하는 solution 함수를 완성해 주세요.
	
	단, 완성될 배열의 길이가 k보다 작으면 나머지 값을 전부 -1로 채워서 return 합니다.
*/