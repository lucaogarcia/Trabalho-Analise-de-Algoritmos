package methods;
public class SelectionSort {
    public void selectionSort(int[] arr) {
        int n = arr.length;
 
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        selectionSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}