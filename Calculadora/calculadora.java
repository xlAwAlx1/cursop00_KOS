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
                System.out.println("Ingrese el primer numero a multiplicar");
                int multiplicar1 = entrada.nextInt();

                System.out.println("Ingrese el segundo numero a multiplicar");
                int multiplicar2 = entrada.nextInt();

                int multiplicar = multiplicar1 * multiplicar2;
                System.out.println("La multiplicacion de: " + multiplicar1 + "y:" + multiplicar2 + "es:" + multiplicar);



                break;

            case 4:
                System.out.println("Digite los numeros a dividir");
                System.out.println("Ingrese el primer numero a dividir");
                int dividir1 = entrada.nextInt();

                System.out.println("Ingrese el segundo numero a dividir");
                int dividir2 = entrada.nextInt();

                int dividir = dividir1 / dividir2;
                System.out.println("La division de: " + dividir1 + "y:" + dividir2 + "es:" + dividir);
                

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
