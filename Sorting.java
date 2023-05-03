import methods.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Sorting {
    public void opcaoOrdenacao(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        ArrayList<Long> tempoOrdenacao = new ArrayList<>();
        System.out.println("Qual o metodo de ordenação?");
        System.out.println("1-InsertionSort");
        System.out.println("2-BubbleSort");
        System.out.println("3-SelectionSort");
        System.out.println("4-ShellSort");
        System.out.println("5-QuickSort");
        System.out.println("6-HeapSort");
        System.out.println("7-MergeSort");
        System.out.println("8-RadixSort");
        System.out.println("9-Todos");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                InsertionSort insertionSort = new InsertionSort();
                System.out.println("Tempo de execução: " + insertionSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 2:
                BubbleSort bubbleSort = new BubbleSort();
                System.out.println("Tempo de execução: " + bubbleSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 3:
                SelectionSort selectionSort = new SelectionSort();
                System.out.println("Tempo de execução: " + selectionSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 4:
                ShellSort shellSort = new ShellSort();
                System.out.println("Tempo de execução: " + shellSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 5:
                QuickSort quickSort = new QuickSort();
                System.out.println("Tempo de execução: " + quickSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 6:
                HeapSort heapSort = new HeapSort();
                System.out.println("Tempo de execução: " + heapSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 7:
                MergeSort mergeSort = new MergeSort();
                System.out.println("Tempo de execução: " + mergeSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 8:
                RadixSort radixSort = new RadixSort();
                System.out.println("Tempo de execução: " + radixSort.cronometraTempo(arr) + "ms");
                continuar();

                break;
            case 9:
                InsertionSort insertion = new InsertionSort();
                int[] arr_insertion = copiarArr(arr);
                long tempoInsertion = insertion.cronometraTempo(arr_insertion);
                tempoOrdenacao.add(tempoInsertion);
                System.out.println("Tempo de execução InsertionSort: " + tempoInsertion + "ms");

                BubbleSort bubble = new BubbleSort();
                int[] arr_bubble = copiarArr(arr);
                long tempoBubble = bubble.cronometraTempo(arr_bubble);
                tempoOrdenacao.add(tempoBubble);
                System.out.println("Tempo de execução BubbleSort: " + tempoBubble + "ms");

                SelectionSort selection = new SelectionSort();
                int[] arr_selection = copiarArr(arr);
                long tempoSelection = selection.cronometraTempo(arr_selection);
                tempoOrdenacao.add(tempoSelection);
                System.out.println("Tempo de execução SelectionSort: " + tempoSelection + "ms");

                ShellSort shell = new ShellSort();
                int[] arr_shell = copiarArr(arr);
                long tempoShell = shell.cronometraTempo(arr_shell);
                tempoOrdenacao.add(tempoShell);
                System.out.println("Tempo de execução ShellSort: " + tempoShell + "ms");

                QuickSort quick = new QuickSort();
                int[] arr_quick = copiarArr(arr);
                long tempoQuick = quick.cronometraTempo(arr_quick);
                tempoOrdenacao.add(tempoQuick);
                System.out.println("Tempo de execução QuickSort: " + tempoQuick + "ms");

                HeapSort heap = new HeapSort();
                int[] arr_heap = copiarArr(arr);
                long tempoHeap = heap.cronometraTempo(arr_heap);
                tempoOrdenacao.add(tempoHeap);
                System.out.println("Tempo de execução HeapSort: " + tempoHeap + "ms");

                MergeSort merge = new MergeSort();
                int[] arr_merge = copiarArr(arr);
                long tempoMerge = merge.cronometraTempo(arr_merge);
                tempoOrdenacao.add(tempoMerge);
                System.out.println("Tempo de execução MergeSort: " + tempoMerge + "ms");

                RadixSort radix = new RadixSort();
                int[] arr_radix = copiarArr(arr);
                long tempoRadix = radix.cronometraTempo(arr_radix);
                tempoOrdenacao.add(tempoRadix);
                System.out.println("Tempo de execução RadixSort: " + tempoRadix + "ms");

                long maiorTempo = tempoOrdenacao.get(0), menorTempo = tempoOrdenacao.get(0);

                for (long elemento : tempoOrdenacao) {
                    if (elemento > maiorTempo) {
                        maiorTempo = elemento;
                    }
                    if (elemento < menorTempo) {
                        menorTempo = elemento;
                    }
                }

                System.out.println();
                System.out.println("Menor tempo de execução: "+ menorTempo + "ms");
                System.out.println("Maior tempo de execução: " + maiorTempo + "ms");
                continuar();


                break;
            default:
                System.out.println("Opção inválida");
                opcaoOrdenacao(arr);

                break;
        }
        sc.close();
    }

    public void opcaoVetor() {
        Scanner sc = new Scanner(System.in);
        int opcao, n;

        System.out.println("Qual o tamanho do vetor?");
        n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Deseja o vetor 1-crescente,2-Decrescente ou 3-Aleatorio?");
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
                }
                imprimeArr(arr);
                System.out.println();
                opcaoOrdenacao(arr);
                break;
            case 2:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = arr.length - i;
                }
                imprimeArr(arr);
                System.out.println();
                opcaoOrdenacao(arr);
                break;
            case 3:
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = (int) (Math.random() * arr.length);
                }
                imprimeArr(arr);
                System.out.println();
                opcaoOrdenacao(arr);
                break;
            default:
                System.out.println("Opção inválida");
                opcaoVetor();
                break;
        }

        sc.close();
    }

    public void continuar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja continuar ? (S/N)");
        String op = sc.next();
        if (op.equalsIgnoreCase("s")) {
            opcaoVetor();
        }
        sc.close();
    }

    public void imprimeArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public int[] copiarArr(int[] arr) {
        int[] arrCopia = new int[arr.length];
        System.arraycopy(arr, 0, arrCopia, 0, arr.length);

        return arrCopia;
    }

}
