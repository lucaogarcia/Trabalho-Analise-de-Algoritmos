package methods;
public class RadixSort {

    public void radixSort(int[] arr) {
        int maxNum = getMax(arr);
        for (int i = 1; maxNum / i > 0; i *= 10) {
            countSort(arr, i);
        }
    }

    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    private static void countSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        for (int i : arr) {
            int digit = (i / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        radixSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
