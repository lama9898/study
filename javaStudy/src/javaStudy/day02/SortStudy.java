package javaStudy.day02;

public class SortStudy {
	
	// 선택 정렬 (min으로 정렬)
	public void selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) { // n-1까지 순회
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++) { // n까지 순회
				if(arr[minIndex]>arr[j]) minIndex = j; //현재까지 최소보다 작으면 min을 변경
			}
			int temp= arr[minIndex]; //min을 정렬하기 전 i번째와 바꾸기
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
	
	

}
