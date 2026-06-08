import java.util.Scanner;

public class NegativosPositivos {
public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    
double[] numeros = new double[10];
int negativos = 0;
double somaPositivos = 0;

for (int i = 0; i < 10; i++) {
    System.out.print("Digite um número: ");
    numeros[i] = sc.nextDouble();

    if (numeros[i] < 0) {
        negativos++;
    }
    if (numeros [i] > 0) {
        somaPositivos = somaPositivos + numeros[i];

    }
}
System.out.println("Quantidade de negativos: " + negativos);
System.out.println("Soma dos positivos: " + somaPositivos);

sc.close();

}
}
