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