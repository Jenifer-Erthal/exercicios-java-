import java.util.Scanner;

public class DoisVetores {
    public static void main(String[]args){
    
    Scanner sc = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

    for (int i = 0; i < 10; i++) {
        System.out.print("Digite um valorA: ");
        A[i] = sc.nextInt();
    }
    for (int i = 0; i < 10; i++) {
        System.out.print("Digite um valor B: ");
        B[i]= sc.nextInt();
    }
    for (int i = 0; i < 10; i++) {
        C[i] = A[i] - B[i];
    }
        System.out.println("Resultao do vetor C:");
        for (int i = 0; i < 10; i++){
            System.out.println(C[i]);
        }
     sc.close();
    }
    }
