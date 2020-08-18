package ar.com.ada.online.second.repetitioncycles;

/*Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el
arreglo y que calcule y presente los resultados siguientes:
El menor elemento del arreglo; la suma de los elementos de las cinco primeras filas del
arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.*/

/*
import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        int[][] arrayOne = new int[10][7];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.printf("Ingrese el valor correspondiente a la fila %d y columna %d del arreglo: ", i, j);
                arrayOne[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("La matriz ingresada es: ");

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < arrayOne[i].length; j++) {
                System.out.print(arrayOne[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        int majorElement, minorElement;
        majorElement = minorElement = arrayOne[0][0];

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i]. length; j++)
            if (arrayOne[i][i] > majorElement) {
                majorElement = arrayOne[i][j];
            }
        }

        System.out.println("Valor mayor: " + majorElement);

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j =0; j < arrayOne[i].length; j++)
            if (arrayOne[i][j] < minorElement) {
                if (arrayOne[i][j] < minorElement) {
                    minorElement = arrayOne[i][j];

                }
            }
        }
        System.out.println("Valor menor: " + minorElement);

        int additionElement = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j; j < arrayOne[i].length; j++)
            if (i < 5) {
                additionElement += arrayOne[i]j];
            }
        }
        System.out.println("La suma se las primeras cinco filas da: " + additionElement);

        int negativeNumbers = 0;

        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayOne[i].length; j++) {
                if (j > 5 && j < 9) {
                    negativeNumbers += 1;
                }

            }
        }
        System.out.println("La cantidad de número negativos es: " + negativeNumbers);


    }
}
*/




