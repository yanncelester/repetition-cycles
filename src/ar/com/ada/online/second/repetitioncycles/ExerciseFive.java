package ar.com.ada.online.second.repetitioncycles;

/*Realice un diagrama de flujo que represente el algoritmo para determinar si una matriz
es de tipo diagonal: es una matriz cuadrada en la cual todos sus elementos son cero,
excepto los electos de la diagonal principal.*/

import java.util.Scanner;

public class ExerciseFive {
    public static void main(String[] args) {
        System.out.println("[Programa para saber si una matriz es diagonal");

        //Declaro variables
        int rowsA, columnB;
        int[][] matrixA;

        //Doy ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de columnas y filas
        System.out.print("Ingrese cantidad de filas de la matriz: ");
        rowsA = keyboard.nextInt();
        System.out.print("Ingrese cantidad de columnas de la matriz: ");
        columnB = keyboard.nextInt();

        //Con un if reviso que sólo sigamos a la siguiente evaluación si la matriz en cuadrada
        if (rowsA != columnB) {
            System.out.println("Los valores ingresados no corresponden a una matriz cuadrada, Intente nuevamente, por favor.");
            System.exit(0);
        }

        //Ahora inicializo mi matriz
        matrixA = new int [rowsA][columnB];

        //Pedimos el llenado de la matriz
        for (int i= 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.printf("Ingrese el valor de la fila para para posición %d y de la columna para la posición %d: ", i, j);
                matrixA[i][j] = keyboard.nextInt();
            }
        }
        System.out.println();
        //Muestro la matriz
        System.out.println("A continuación verá la matriz que ha completado:");
        for (int i = 0; i < matrixA.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print(matrixA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        System.out.println();

 // Ahora valido si es una matriz diagonal
            for (int i= 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[i].length; j++) {
            if (i != j) {
                if (matrixA[i][j] == 0) {
                    System.out.println("Se ingreso una matriz diagonal");
                } else {
                    System.out.println("La matriz ingresada no es una matriz diagonal");
                }
            }
        }



    }}}

