import java.util.Scanner;

public class MatrizIdentidade {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o tamanho da matriz (n): ");
    int n = sc.nextInt();

    int[][] matriz = new int[n][n];
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j) {
                matriz[i][j] = 1;    
            } else {
                matriz[i][j] = 0;
            }
        }
    }
System.out.println("\\nMatriz identidade:");
for (int i = 0; i < n; i++){
    for (int j = 0; j < n; j++){
        System.out.print(matriz[i][j] + "\t");
    }
        System.out.println();

    }
   sc.close();
}
}
