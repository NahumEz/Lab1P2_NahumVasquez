package lab1p2_nahumvasquez;

import java.util.Scanner;
import java.util.Random;

public class Lab1P2_NahumVasquez {
// Mi filita bonita es la 2 y en la bonita columna 4
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Ingrese el tamanio de matriz deseado: ");
        size = sc.nextInt();
        int[][] nuevaMatriz = crearMatriz(size);
        imprimirMatriz(nuevaMatriz);
        int[][] ordenada = bubbleSort(nuevaMatriz);
        System.out.println("LA NUEVA MATRIZ ORDENADA ES: ");
        imprimirMatriz(ordenada);
    }// nunca vi matrices
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
//Nunca vi matricez
    public static int[][] bubbleSort(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length ; j++) {
                if (matriz[i][0] > matriz[i][0+1]) {
                    matriz[i][0] = matriz[i][0+1];
                }

            }
        } //
        return matriz; // Nunca vi matricez
    }
     // NUNCA VI MATRICEZ
}
