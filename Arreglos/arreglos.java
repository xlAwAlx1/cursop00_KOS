import java.util.Scanner;

public class arreglos{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int filas, columnas;
        do{
            System.out.println("Numero de filas:");
            filas = entrada.nextInt();
        }while (filas < 1);
        do{
            System.out.println("Numero de columnas:");
            columnas = entrada.nextInt();
        }while (columnas < 1);
        int[][] matrix1 = new int[filas][columnas];
        int[][] matrix2 = new int[filas][columnas];
        int[][] matrix3 = new int[filas][columnas];

        System.out.println("Matriz 1");
        for(int i = 0; i < matrix1.length; i++){
            for(int j = 0; j < matrix1[i].length; j++)
            {
                System.out.println("Elemento[" + i + "][" + j + "] =");
                matrix1[i][j] = entrada.nextInt();
            }
        }
        
        System.out.println("Matriz 2");
        for(int i = 0; i < matrix2.length; i++){
            for(int j = 0; j < matrix2[i].length; j++)
            {
                System.out.println("Elemento[" + i + "][" + j + "] =");
                matrix2[i][j] = entrada.nextInt();
            }
        }
        for (int i = 0; i < matrix1.length; i++) {
            for(int j = 0; j < matrix1[i].length; j++)
            matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            
        }
        System.out.println("Matriz 1:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++){
                System.out.printf("%3d", matrix1[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nmatriz 2:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++){
                System.out.printf("%3d", matrix2[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nMatriz 3");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++){
                System.out.printf("%3d", matrix1[i][j]);
            }
            System.out.println();
        }
    }

}