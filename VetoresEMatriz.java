   import java.util.Scanner;

public class VetoresEMatriz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];
        int[][] matriz = new int[3][5];

        System.out.println("Digite 5 números PARES para o vetor A:");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("A[" + i + "]: ");
                A[i] = sc.nextInt();
                if (A[i] % 2 != 0) {
                    System.out.println("Valor inválido! Digite apenas números pares.");
                }
            } while (A[i] % 2 != 0);
        }

        System.out.println("\nDigite 5 números ÍMPARES para o vetor B:");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("B[" + i + "]: ");
                B[i] = sc.nextInt();
                if (B[i] % 2 == 0) {
                    System.out.println("Valor inválido! Digite apenas números ímpares.");
                }
            } while (B[i] % 2 == 0);
        }

        // Montando a matriz
        for (int i = 0; i < 5; i++) {
            matriz[0][i] = A[i];
            matriz[1][i] = B[i];
            matriz[2][i] = A[i] + B[i];
        }

        // Exibindo a matriz
        System.out.println("\nMatriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}