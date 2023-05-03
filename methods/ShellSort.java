package methods;
public class ShellSort {
    public void shellSort(int[] array) {
        int n = array.length;
    
        // Definir o intervalo
        int intervalo = 1;
        while (intervalo < n / 3) {
            intervalo = intervalo * 3 + 1;
        }
    
        while (intervalo > 0) {
            // Aplicar o insertion sort com o intervalo definido
            for (int i = intervalo; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= intervalo && array[j - intervalo] > temp) {
                    array[j] = array[j - intervalo];
                    j -= intervalo;
                }
                array[j] = temp;
            }
            // Reduzir o intervalo
            intervalo = (intervalo - 1) / 3;
        }
    }

    public long cronometraTempo(int[] arr) {
        long startTime = System.nanoTime();
        shellSort(arr);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000;
    }
}
