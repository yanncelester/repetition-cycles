package ar.com.ada.online.second.repetitioncycles;

/*  Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz
transpuesta de cualquier matriz de orden M x N. */

import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        //Declaro mis variables

        int quantRow;
        int quantColumn;
        int[][] matrizA;
        int[][] matrizB;
        //Doy ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido al user que le de tamaño a mi matriz
        System.out.println("Ingrese cantidad de filas: ");
        quantRow = keyboard.nextInt();
        System.out.println("Ingrese cantidad de columnas: ");
        quantColumn = keyboard.nextInt();

        //Ahora inicializo
        matrizA = new int[quantRow][quantColumn];
        matrizB = new int[quantColumn][quantRow];

        //Ahora recorro arreglo y le pido al user que llene la matriz
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese el número de fila %d y el número de columna %d para la posición ", i, j);
                matrizA[i][j] = keyboard.nextInt();
            }
        }
// En este for hacemos la asignación de B, imprimimos A para ver como queda
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }
        System.out.println();

        for (int i = 0; i < matrizA.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        System.out.println();

        // Hacemos el mismo for pero para mostrar la "b"
        for (int i = 0; i < matrizB.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
