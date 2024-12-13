import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int valor = 0;
        int arreglo[] = new int[10];
        
        Scanner entrada = new Scanner(System.in);

        for(int i = 0; i < matrix.length; i++){
            System.out.println("Posicion: " + i);

            for(int j = 0; j < matrix.length; j++){
                System.out.print(String.format("%d", matrix[i][j])+ "\n");
            }
        System.out.println();
        }


    }
    
}
