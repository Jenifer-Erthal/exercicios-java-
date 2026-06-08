public class FuncaoDivisao {
    public static void divisao(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero não é permitida.");
        }
        double resultado = a / b;
        System.out.println("Resultado da divisão: " + resultado);
    }
    public static void main(String[] args) {
        divisao(10.0, 2.0);
    }
}
