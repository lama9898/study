#include <stdlib.h>

// selection sort, ��������
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

// bubble sort, ��������
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

// insert sort, ��������
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

// mergeSort, ��������
//���� �Լ�
void merge(int arr[], int left, int mid, int right) {
	int leftSize = mid - left + 1;
	int rightSize = right - mid;
	/*int leftArray[leftSize];
	int rightArray[rightSize];*/
	// ���� ũ���� �迭 �Ҵ��� �����͸� ����ؾ��� => #include <stdlib.h>
	int* leftArray = (int*)malloc(leftSize * sizeof(int));
	int* rightArray = (int*)malloc(rightSize * sizeof(int));
	
	//�����͸� �ӽù迭�� �ֱ�
	for (int i = 0; i < leftSize; i++) {
		leftArray[i] = arr[left + i];
	}
	for (int i = 0; i < rightSize; i++) {
		rightArray[i] = arr[mid + 1 + i];
	}

	//�ӽ� �迭 ����
	int i = 0, j = 0, k = left; //left�� 0�� �ƴҼ�����. ���ȣ���̱� ������
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

	//���� ��Ұ� �ִ� ��� �迭�� ���� �ٿ��ֱ�
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

	free(leftArray); //�迭 ����ũ�� �Ҵ� ����
	free(rightArray);
}
//�����Լ�
void mergeSort(int arr[], int left, int right) {
	if (left < right) {
		int mid = left + (right - left) / 2; //���� �÷� ����. ������ �� ����.
		// (�ٸ� ���:int mid = (left + right) / 2;)
		mergeSort(arr, left, mid);
		mergeSort(arr, mid + 1, right);
		merge(arr, left, mid, right);
	}
}