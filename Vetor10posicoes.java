import java.util.Scanner;

public class Vetor10posicoes {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
    
  int[] vetor = new int[10];
  int contador = 0;
  for (int i = 0; i< 10; i++) {
    System.out.print("Digite um valor: ");
    vetor[i] = sc.nextInt();

  if (vetor[i] % 2 == 0){
        contador++;

    }
}
 System.out.println("Quantidade de números pares: " + contador);
   
 sc.close();

    }
    
}
