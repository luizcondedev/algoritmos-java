package SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] lista = {3 ,2, 7, 4, 1, 20, 15, 14, 45, 13, 23, 34, 95, 34, 12, 23, 43, 63, 5};

        int[] lista100Elementos = {
                73, -12, 45, 8, 91, 34, -5, 67, 23, 56,
                12, 89, 3, 41, -18, 76, 29, 64, 15, 52,
                7, 38, 100, -2, 84, 19, 61, 27, 49, 33,
                5, 72, -25, 88, 14, 63, 21, 97, 42, 9,
                31, 58, 6, 80, -7, 16, 44, 69, 28, 53,
                11, 36, 75, 4, 82, 24, 59, 13, 47, 92,
                18, -31, 66, 39, 2, 85, 30, 55, 10, 74,
                22, 48, 68, 1, 87, 35, -9, 51, 94, 17,
                62, 26, 78, 43, 0, 71, 25, 57, 20, 83,
                46, 32, 60, 79, 37, 50, 90, 54, 70, 40
        };

        int[] lista100ElementosOriginal = lista100Elementos.clone(); //Salvo um clone da lista original

        //int [] listaOrganizada = SelectionSort.ordenar(lista);
        SelectionSort.ordenar(lista100Elementos); //Ordeno a lista usando o método ordenar da classe SelectionSort

        System.out.println("Desordenada: " + Arrays.toString(lista100ElementosOriginal));
        System.out.println("Ordenada: " + Arrays.toString(lista100Elementos));
    }
}
