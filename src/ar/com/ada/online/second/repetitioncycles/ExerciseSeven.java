package ar.com.ada.online.second.repetitioncycles;

/* Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal
forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el
último pase a ser el primero, y así sucesivamente. Represéntelo mediante un diagrama
de flujo*/

import java.util.Scanner;

public class ExerciseSeven {
    public static void main(String[] args) {
        int[] arrayTwo;
        int[] arrayOne;
        int arraySize;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del vector: ");
        arraySize = keyboard.nextInt();

        arrayOne = new int[arraySize];
        arrayTwo = new int[arraySize];

        for (int i = 0; i < arrayOne.length; i++) {
            System.out.printf("Ingrese el valor correspondiente a la posición %d del vector: ", i);
            arrayOne[i] = keyboard.nextInt();
        }

        System.out.println("Su vector quedó completo de la siguiente manera: ");

        for (int i= 0; i < arrayOne.length; i++) {
            System.out.print(" | ");
            System.out.print(arrayOne[i]);
        }
        System.out.println();

        for (int i = 0; i < arrayOne.length; i++) {
            if (i == arraySize -1) {
                arrayTwo[0] = arrayOne[i];
            } else {
                arrayTwo[i + 1] = arrayOne[i];
            }
        }

        System.out.println("Ejecutado el proceso nuestro arreglo queda de la siguiente manera : ");
        for (int i= 0; i < arrayTwo.length; i++) {
            System.out.print(" | ");
            System.out.print(arrayTwo[i]);
        }
        System.out.println();




    }
}
