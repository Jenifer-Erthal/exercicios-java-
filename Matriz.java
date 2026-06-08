import java.util.Scanner;
public class Matriz {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int[][] matriz = new int [3][4];

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 4; j++){
                System.out.print("Digite um número para [" + i +"][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("nMatriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <4; j++){
                System.out.print(matriz[i][0] + "\t");
            }
            System.out.println();
        }
        System.out.println("nMenor elemento de cada linha:");
        for (int i = 0; i < 3; i++) {
        int menor = matriz[i][0];
        
        for(int j = 1;  j < 4; j++) {
        if (matriz[i][j] < menor) {
        menor = matriz[i][j];
        }
    }
    System.out.println("Linha" + i +": " + menor);
}
System.out.println("\nMaior elemento de cada coluna:");
for (int j = 0; j < 4; j++) {
    int maior = matriz[0][j];

    for (int i = 1; i < 3; i++){
        if (matriz[i][j] > maior) {
            maior = matriz[i][j];
        }
    }
System.out.println("Coluna " + j + ": " + maior);
}
sc.close();
}
}