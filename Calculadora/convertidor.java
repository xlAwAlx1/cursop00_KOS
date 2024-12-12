package Calculadora;
import java.util.Scanner;

public class convertidor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char letra;
        do{
        System.out.println("Convertidor de unidades");
        System.out.println("1.- Metro a Kilometros");
        System.out.println("2.- Metros a Centimetros");
        System.out.println("3.- Metros a Milimetros");
        System.out.println("4.- Kilogramos a gramos");
        System.out.println("5.- kiogramos a libras");
        System.out.println("6.- Metros/segundo a kilometros/hora");
      
        System.out.println("Seleccione la opcion deseada:");

        int opcion = scanner.nextInt();
        System.out.println("Ingrese el valos a convertir:");
        double milimetros, centimetros, metros, kilometros, velocidad, kilogramos, gramos,libras;
        opcion = scanner.nextInt();
        letra = scanner.next().charAt(0);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de metros a kilometros que desea convertir:");
                metros = scanner.nextDouble();
                kilometros = metros / 1000;
                System.out.println("metros equivale a:"+kilometros+ "kilometros");
                break;

            case 2:
                System.out.println("Ingrese la cantidad de metros a centimetros");
                metros = scanner.nextDouble();
                centimetros = metros * 100;
                System.out.println("metros equivale a:"+centimetros+"centimetros");

                break;

            case 3:
                System.out.println("Ingrese los metros a milimetro");
                metros = scanner.nextDouble();
                milimetros = metros * 1000;
                System.out.println("metros equivale a:"+milimetros+"milimetros");
                break;
            case 4:
                System.out.println("Ingrese los kilogramos a gramos que desea convertir:");
                kilogramos = scanner.nextDouble();
                gramos = kilogramos * 1000;
                System.out.println("Los kilogramo equivalen a:"+kilogramos+"gramos");
                break;
            case 5:
                System.out.println("Ingrese los kilogramos a libras que desea convertir:");
                libras = scanner.nextDouble();
                kilogramos = libras * 0.45359;
                System.out.println("Los kilogramo equivalen a:"+libras+"gramos");
                 
                default:
                System.out.println("Opcion no valida");
                break;
        }
    }while (letra == 's' || letra == 'S');
        
        scanner.close();
    }    
}
