package Calculadora;

import java.util.Scanner;


public class calculadora {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);


        int opcion;
        char letra;

        do{
        System.out.println("CALCULADORA DIGITAL:");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicacion");
        System.out.println("4.- Division");
        System.out.println("Ingrese una opcion para continuar:");

        opcion = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Introduce el primer numero:");
                int numero1 = entrada.nextInt();

                System.out.println("Introduce el segundo numero:");
                int numero2 = entrada.nextInt();

                int suma = numero1 + numero2;
                System.out.println("La suma de" + numero1 + "y" + numero2 + "es:" + suma);

                break;
            case 2:
                System.out.println("Introduce el primer número:");
                int resta1 = entrada.nextInt();

                System.out.println("Introduce el segundo número:");
                int resta2 = entrada.nextInt();

                int resta = resta1 - resta2;
                System.out.println("La resta de " + resta1 + " y " + resta2 + " es: " + resta);

                break;

            case 3:
                System.out.println("Digite los numeros a multiplicar");

                break;

            case 4:
                System.out.println("Digite los numeros a dividir");

                break;

            default:
                break;
        }
        System.out.println("Para regresar marca 's' o 'S':");
        letra = entrada.next().charAt(0);
        
    } while( letra == 's' || letra == 'S');
    System.out.println("Hasta luego:");
    entrada.close();
        }
}
