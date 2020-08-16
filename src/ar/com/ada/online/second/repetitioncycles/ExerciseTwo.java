package ar.com.ada.online.second.repetitioncycles;

/*Realice y represente mediante un diagrama de flujo el algoritmo para obtener el
producto de dos matrices de orden M x N y P x Q.*/

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println("[Programa para obtener el producto de dos matrices]");
        //Defino mis variables
        int quanRowA, quanRowB;
        int quanColumA, quanColumB;
        int[][] matrizA;
        int[][] matrizB;
        int[][] productmatriz;

        //Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido que ingresen el tamaño de las matrices:
        System.out.println("A continuación solicitaremos los datos de la matriz A");
        System.out.print("Ingrese cantidad de filas: ");
        quanRowA = keyboard.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        quanColumA = keyboard.nextInt();


        System.out.println("A continuación solicitaremos los datos de la matriz B");
        System.out.print("Ingrese cantidad de filas: ");
        quanRowB = keyboard.nextInt();
        System.out.print("Ingrese cantidad de columnas: ");
        quanColumB = keyboard.nextInt();

        //Inicializo mis matrices
        matrizA = new int[quanRowA][quanColumA];
        matrizB = new int[quanRowB][quanColumB];
        productmatriz = new int[quanRowA][quanColumB];

        //Hago el if para evitar que se intenten multiplar matrices distintas
        if (quanColumA != quanRowB) {
            System.out.println("No se puede hacer el producto de estas matrices");
            System.exit(0);
        }

        //Hago el primer for para recorrer y llenar matriz A
        System.out.println("Ingrese los datos para llenar matriz A");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.printf("Ingrese el número de fila %d y el número de columna %d para la posición: ", i, j);
                matrizA[i][j] = keyboard.nextInt();
            }
        }
        //Hago el segundo for para recorrer y llenar matriz B
        System.out.println("Ingrese los datos para llenar matriz B");
        for (int i = 0; i < matrizB.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.printf("Ingrese el número de fila %d y el número de columna %d para la posición: ", i, j);
                matrizB[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Estas son las dos matrices que ud a completado:");

        //Hago los for para mostrarlas
        for (int i = 0; i < matrizA.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < matrizB.length; i++) {
            System.out.print(" | ");
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                productmatriz[i][j] = 0;
            }

        }

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                for (int k = 0; k < matrizA[i].length; k++) {
                    productmatriz[i][j] = productmatriz[i][j] + (matrizA[i][k] * matrizB[k][j]);
                }
            }
        }
        System.out.println();
        //La imprimo
        System.out.println("El resultado del producto de las matrices anteriores es: ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(productmatriz[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

    }
}
