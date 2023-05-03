package methods;
public class HeapSort {
    public void heapSort(int[] array) {
        int n = array.length;

        // Constrói a heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Extrai um por um os elementos da heap
        for (int i = n - 1; i > 0; i--) {
            // Move o maior elemento para o final do array
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Reconstroi a heap na parte não ordenada do array
            heapify(array, i, 0);
        }
    }

    // Transforma um sub-heap em uma heap válida
    private static void heapify(int[] array, int n, int i) {
        int largest = i; // Inicializa o maior elemento como a raiz
        int left = 2 * i + 1; // Filho esquerdo
        int right = 2 * i + 2; // Filho direito

        // Verifica se o filho esquerdo é maior que a raiz
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        // Verifica se o filho direito é maior que a raiz
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        // Se o maior elemento não for a raiz
        if (largest != i) {
            // Troca a raiz pelo maior elemento
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            // Reconstroi a heap recursivamente na subárvore afetada
            heapify(array, n, largest);
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        heapSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}

