package ar.com.ada.online.second.repetitioncycles;


//Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los elementos de la diagonal principal
// de una matriz de 5 por 5 elementos, represéntelo mediante diagrama y pseudocódigo*/

import java.util.Scanner;

public class ExerciseNineteen {
    public static void main(String[] args) {
        int[][] matrixOne = new int[5][5];
        int additionElement = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.printf("Ingrese la posición %d de la fila y %d de la columna: ", i, j);
                matrixOne[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("A continuación verá la matriz ingresada: ");

        for (int i = 0; i < matrixOne.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrixOne[i].length; j++) {
                System.out.print(matrixOne[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrixOne.length; i++) {
            for (int j = 0; j < matrixOne[i].length; j++) {
                if (i == j) {
                    additionElement += matrixOne[i][j];
                }
            }
        }
        System.out.println("La suma de elementos de la diagonal principal de la matriz es: " + additionElement);
    }
}
