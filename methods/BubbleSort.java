package methods;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // troca arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        bubbleSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}