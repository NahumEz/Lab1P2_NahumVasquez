package lab1p2_nahumvasquez;

import java.util.Scanner;
import java.util.Random;

public class Lab1P2_NahumVasquez {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Ingrese el tamanio de matriz deseado: ");
        size = sc.nextInt();
        crearMatriz(size);
        imprimirMatriz(crearMatriz(size));
        
        
    }

    // METODOS
    public static int[][] crearMatriz(int x) {
        Random rand = new Random();
        int[][] matriz = new int[x][x];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = rand.nextInt(9);
            }
        }
        return matriz;
    }

    public static int[][] imprimirMatriz(int[][] matrizgenerada) {
        for (int i = 0; i < matrizgenerada.length; i++) {
            for (int j = 0; j < matrizgenerada[i].length; j++) {
                System.out.print("[" + matrizgenerada[i][j] + "]");
            }
            System.out.println("");
        }
        return matrizgenerada;
    }

    public static int[][] bubbleSort(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > matriz[i][j + 1]) {
                    matriz[i][j] = matriz[i][j + 1];
                }

            }
        }
        return matriz;
    }
     
}
