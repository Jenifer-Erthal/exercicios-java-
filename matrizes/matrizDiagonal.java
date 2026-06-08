import java.util.Scanner;
public class MatrizDiagonal{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] matriz = new int[3][3];

    for (int i = 0; i < 3; i++){
        for (int j = 0; j < 3; j++){
            do {
                System.out.print("Digite um número inteiro positivo para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] <= 0) {
                    System.out.println("Valor inválido! Digite apenas números positivos.");

                }

            } while (matriz[i][j] <= 0);
        }
    }
   System.out.println("\nDiagonal Pricipal:");
   for (int i = 0; i < 3; i++) {
    System.out.print(matriz[i][i] + " ");
  }

   System.out.println("\nDiagonal Secundaria:");
   for (int i = 0; i < 3; i++) {
    System.out.print (matriz[i][2 -i] + " ");
   
   }
sc.close();
   }
}
