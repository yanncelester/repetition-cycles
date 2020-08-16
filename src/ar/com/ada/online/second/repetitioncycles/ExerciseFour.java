package ar.com.ada.online.second.repetitioncycles;

/*Realice un algoritmo para obtener una matriz como el resultado de la resta de dos
matrices de orden M x N. */

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        System.out.println("[Algoritmo para obtener una matriz como el resultado de la resta de dos\n" +
                "matrices]");
        //Declaro mis variables
        int rowsA, rowsB, columnsA, columnsB;
        int[][] matrixA;
        int[][] matrixB;
        int[][] matrixC;


        Scanner keyboard = new Scanner(System.in);

        //Pido que ingresen el tamaño de las matrices:
        System.out.println("A continuación solicitaremos los datos de la matriz A");
        System.out.print("Ingrese cantidad de filas: ");
        rowsA = keyboard.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        columnsA = keyboard.nextInt();


        System.out.println("A continuación solicitaremos los datos de la matriz B");
        System.out.print("Ingrese cantidad de filas: ");
        rowsB = keyboard.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        columnsB = keyboard.nextInt();

        //Hago una condición para sólo seguir cuando las matrices tienen la misma dimensión
        if (rowsA != rowsB || columnsA != columnsB) {
            System.out.println("Las matrices ingresadas, dadas sus dimensiones no pueden restarse.");
            System.exit(0);
        }

        //Inicializo mis matrices
        matrixA = new int[rowsA][columnsA];
        matrixB = new int[rowsB][columnsB];
        matrixC = new int[rowsA][columnsB];

        //Pido ingreso de datos para llenar las matrices

        System.out.println("A continuación ingrese los datos de la matriz A");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.printf("Ingrese el valor de la fila correspondiente a la posición %d y de columan correspondiente a la posición %d: ", i, j);
                matrixA[i][j] = keyboard.nextInt();
            }
        }
        System.out.println();
        System.out.println("A continuación ingrese los datos de la matriz B");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.printf("Ingrese el valor de la fila correspondiente a la posición %d y de columan correspondiente a la posición %d: ", i, j);
                matrixB[i][j] = keyboard.nextInt();
            }
        }
        System.out.println();


        //Imprimo las matrices:
        System.out.println("Estas son las matrices que ud ha ingresado: ");

        for (int i = 0; i < matrixA.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrixB.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print(matrixB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        //Muestro resultado:
        for (int i = 0; i < matrixC.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrixC[i].length; j++) {
                System.out.print(matrixC[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }


    }
}
