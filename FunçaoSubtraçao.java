public class FunçaoSubtraçao {
    public static double subtraçao (double a, double b){
        double resultado = a - b;
        return resultado;
    }
    public static void main(String[] args) {
        double resultadoFinal = subtraçao(10.5, 4.2);
        System.out.println("A subtraçao é: " + resultadoFinal);
    }
}