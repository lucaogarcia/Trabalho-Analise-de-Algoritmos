package methods;
public class MergeSort {
    // método principal para ordenar o array
    public void sort(int[] arr) {
        int[] aux = new int[arr.length];
        mergeSort(arr, aux, 0, arr.length-1);
    }
    
    // método auxiliar para ordenação
    private void mergeSort(int[] arr, int[] aux, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSort(arr, aux, left, mid);
        mergeSort(arr, aux, mid+1, right);
        merge(arr, aux, left, mid, right);
    }
    
    // método auxiliar para mesclar as duas metades ordenadas
    private void merge(int[] arr, int[] aux, int left, int mid, int right) {
        for (int i = left; i <= right; i++) {
            aux[i] = arr[i];
        }
        int i = left;
        int j = mid+1;
        for (int k = left; k <= right; k++) {
            if (i > mid) {
                arr[k] = aux[j++];
            } else if (j > right) {
                arr[k] = aux[i++];
            } else if (aux[j] < aux[i]) {
                arr[k] = aux[j++];
            } else {
                arr[k] = aux[i++];
            }
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        sort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
