# selectionSort
def selection_sort(arr):
    for i in range(len(arr)-1):
        min = i
        for j in range(i+1,len(arr)):
            if arr[j]<arr[min]:
                min = j
        temp = arr[i]
        arr[i] = arr[min]
        arr[min] = temp

# bubbleSort
def bubble_sort(arr):
    for i in range(len(arr)-1):
        sorted = True
        for j in range(len(arr)-1-i):
            if arr[j] > arr[j+1]:
                arr[j],arr[j+1] = arr[j+1],arr[j]
                sorted = False
        if sorted:
            break