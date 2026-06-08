import java.util.Scanner;
public class Calculadora {

    // Função soma (sem retorno)
    public static void soma(double a, double b) {
        System.out.println("Resultado: " + (a + b));
    }

    // Função subtração (com retorno)
    public static double subtracao(double a, double b) {
        return a - b;
    }

    // Função multiplicação (com retorno)
    public static double multiplicacao(double a, double b) {
        return a * b;
    }

    // Função divisão (sem retorno)
    public static void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero.");
            return;
        }
        System.out.println("Resultado: " + (a / b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Menu
        System.out.println("=== CALCULADORA ===");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma opção: ");

        int opcao = sc.nextInt();

        // Entrada de valores
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        // Escolha da operação
        switch (opcao) {
            case 1:
                soma(num1, num2);
                break;

            case 2:
                double resSub = subtracao(num1, num2);
                System.out.println("Resultado: " + resSub);
                break;

            case 3:
                double resMult = multiplicacao(num1, num2);
                System.out.println("Resultado: " + resMult);
                break;

            case 4:
                divisao(num1, num2);
                break;

            default:
                System.out.println("Opção inválida.");
        }

        sc.close();
    }
}
