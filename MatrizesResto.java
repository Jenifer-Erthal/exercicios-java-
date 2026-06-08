import java.util.Scanner;

public class MatrizesResto {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] A = new int[2][2];
        int[][] B = new int[2][2];
        int[][] R = new int[2][2];
          
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                do {
                    System.out.print ("Digite um número positivo para A[" + i +"][" + j + "]: ");
                    A[i][j] = sc.nextInt();
                } while (A[i][j] <= 0);
            }
        }
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) {
                B[i][j] = 2;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                R[i][j] = A[i][j] % B[i][j];
            }
        }
       System.out.println("\nMtriz R (resto da divisao):");
       for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(R[i][j] + "\t");
        }
        System.out.println();
       }
       sc.close();
    }
}
