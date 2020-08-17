package ar.com.ada.online.second.repetitioncycles;

/*Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
vectores, y con base en esto se determine el nombre del alumno con la edad mayor del
arreglo*/

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        String[] arrayNames = new String[3];
        int[] arrayAge = new int[3];
        int maximunAge = 0, iMax = 0;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < arrayNames.length; i++) {
            System.out.printf("Ingrese el nombre del alumno %d: ", i);
            arrayNames[i] = keyboard.next();
            System.out.printf("Ingrese la edad del alumno %d: ", i);
            arrayAge[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayAge.length; i++) {
            int age = arrayAge[i++];
            if (maximunAge < age) {
                maximunAge = age;
                iMax = maximunAge;
            }

        }

        System.out.println("El alumno " + arrayNames[maximunAge] + " de edad " + arrayAge[maximunAge] + " es el alumno con más edad");

    }
}

