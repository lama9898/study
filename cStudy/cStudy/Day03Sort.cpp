#include <stdlib.h>

// selection sort, 선택정렬
void selectionSort(int arr[], int size) { //int size = sizeof(arr) / sizeof(arr[0]);
	int minIndex, temp;
	for (int i = 0; i < size - 1; i++) {
		minIndex = i;
		for (int j = i+1; j < size; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		temp = arr[minIndex];
		arr[minIndex] = arr[i];
		arr[i] = temp;
	}

}

// bubble sort, 버블정렬
void bubbleSort(int arr[], int size) {
	int temp, sorted;
	for (int i = 1; i < size; i++) {
		sorted = 1;
		for (int j = 0; j < size - i; j++) {
			if (arr[j] > arr[j + 1]) {
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				sorted = 0;
			}
		}
		if (sorted == 1) {
			break;
		}
	}
}

// insert sort, 삽입정렬
void insertSort(int arr[], int size) {
	for (int i = 1; i < size; i++) {
		int key = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = key;
	}
}

// mergeSort, 병합정렬
//병합 함수
void merge(int arr[], int left, int mid, int right) {
	int leftSize = mid - left + 1;
	int rightSize = right - mid;
	/*int leftArray[leftSize];
	int rightArray[rightSize];*/
	// 동적 크기의 배열 할당은 포인터를 사용해야함 => #include <stdlib.h>
	int* leftArray = (int*)malloc(leftSize * sizeof(int));
	int* rightArray = (int*)malloc(rightSize * sizeof(int));
	
	//데이터를 임시배열에 넣기
	for (int i = 0; i < leftSize; i++) {
		leftArray[i] = arr[left + i];
	}
	for (int i = 0; i < rightSize; i++) {
		rightArray[i] = arr[mid + 1 + i];
	}

	//임시 배열 병합
	int i = 0, j = 0, k = left; //left는 0이 아닐수있음. 재귀호출이기 때문에
	while (i < leftSize && j < rightSize) {
		if (leftArray[i] <= rightArray[j]) {
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
	while (i < leftSize) {
		arr[k] = leftArray[i];
		i++;
		k++;
	}
	while (j < rightSize) {
		arr[k] = rightArray[j];
		j++;
		k++;
	}

	free(leftArray); //배열 동적크기 할당 해제
	free(rightArray);
}
//정렬함수
void mergeSort(int arr[], int left, int right) {
	if (left < right) {
		int mid = left + (right - left) / 2; //오버 플로 방지. 이쪽이 더 안전.
		// (다른 방식:int mid = (left + right) / 2;)
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}
}