package javaStudy.day02;

public class SortStudy {

	// 선택 정렬 (min으로 정렬)
	public void selectionSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) { // n-1까지 순회
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++) { // n까지 순회
				if(arr[minIndex]>arr[j]) minIndex = j; //현재까지 최소보다 작으면 min을 변경
			}
			int temp= arr[minIndex]; //min을 정렬하기 전 i번째와 바꾸기
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	// 버블 정렬
	public void bubbleSort(int[] arr) {
		for(int i=1; i<arr.length; i++) { // n-1까지 순회
			boolean sorted = true; // 매 반복마다 sorted를 true로 초기화
			for(int j=0; j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j + 1] = temp;
	                sorted = false; //정렬되지 않은 상태
				}
			}
			if(sorted) break; //정렬할 필요가 없었으므로 정렬완료된 상태
		}
	}
	
	//삽입 정렬
	public void insertSort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			int key = arr[i]; //기준 요소
			int j = i-1;
			while(j>=0 && arr[j] > key) { //arr[j]가 기준 요소보다 큰 경우 오른쪽으로 이동
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	
	//병합 정렬
	//병합 정렬 함수 + 병합 함수 2가지 필요
	public void mergeSort(int[] arr, int left, int right) {
		//left : 0, right : arr.length-1
		if(left<right) {
			int mid = (left+right)/2; //배열을 절반으로 분할하기
			mergeSort(arr,left,mid); //재귀호출
			mergeSort(arr,mid+1,right); //왼쪽, 오른쪽 나눠서 정렬
			merge(arr,left,mid,right); //배열 병합
		}
	}
	//병합함수
	public void merge(int[] arr, int left, int mid, int right) {
		//두 하위 배열의 크기 계산
		int leftSize = mid-left+1;
		int rightSize= right-mid;
		
		//임시 배열
		int[] leftArray = new int[leftSize];
		int[] rightArray = new int[rightSize];
		
		//데이터를 임시배열에 넣기
		for(int i =0;i<leftSize;i++) {
			leftArray[i] = arr[left+i];
		}
		for(int i=0;i<rightSize;i++) {
			rightArray[i] = arr[mid+1+i];
		}
		
		//임시 배열 병합
		int i=0,j=0;
		int k = left;
		while(i<leftSize && j<rightSize) {
			if(leftArray[i] <= rightArray[j]) {
				arr[k] = leftArray[i];
				i++;
			}
			else {
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		//남은 요소가 있는 경우 배열에 마저 붙여넣기
		while(i<leftSize) {
			arr[k]= leftArray[i];
			i++;
			k++;
		}
		while(j<rightSize) {
			arr[k]=rightArray[j];
			j++;
			k++;
		}
	}
	
	//큌 정렬
	public void quickSort(int[] arr) {
		
	}
	
	//힙 정렬
	public void headSort(int[] arr) {
		
	}
	
}