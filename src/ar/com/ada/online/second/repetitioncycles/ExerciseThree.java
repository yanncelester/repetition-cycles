package ar.com.ada.online.second.repetitioncycles;

/* Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
diagonal principal*/

import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        System.out.println("[Programa para leer filas y columnas y calcular elementos de diagonal principal]");
        int arrayRow, arrayColumn;
        int[][] arrayOne;
        int[] mainDiagonal;
        int sumMainDiagonal = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese número de filas: ");
        arrayRow = keyboard.nextInt();
        System.out.print("Ingrese número de columnas: ");
        arrayColumn = keyboard.nextInt();

        //Inicializo
        arrayOne = new int[arrayRow][arrayColumn];

        //If para evitar que se ingresen matrices no cuadradas
        if (arrayRow != arrayColumn) {
            System.out.println("Se requiere una matriz cuadrada para efectuar la operación. No podemos realizar la acción con los valores dados");
            System.exit(0);
        }

        //Llenamos el arreglo
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.printf("Ingrese los valores correspondientes a la posición de la fila %d y a la posición %d de la columna: ", i, j);
                arrayOne[i][j] = keyboard.nextInt();
            }
        }

        //Lo mostramos
        System.out.println("Estas son las dos matrices que ud ha completado:");
        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        //Inicializo diagonal principal
        mainDiagonal = new int[arrayOne.length];

        System.out.println();

        //Muestro diagonal principal
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                if (i == j) {
                    mainDiagonal[i] = arrayOne[i][j];
                    System.out.print(mainDiagonal[i]);
                }
                System.out.print(" | ");
            }
        }

        System.out.println();

        // Sumo los elementos
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                if (i == j) {
                    sumMainDiagonal += arrayOne[i][j];
                }
            }
        }
        System.out.println("La suma se los elementos de la diagonal principal es: " + sumMainDiagonal);
    }
}

