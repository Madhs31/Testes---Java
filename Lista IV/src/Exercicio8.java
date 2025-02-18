public class Exercicio8 {
    public static void main(String[] args) {
        int[] M = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] N = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int produtoEscalar = 0;

        // Calcular o produto escalar
        for (int i = 0; i < M.length; i++) {
            produtoEscalar += M[i] * N[i];
        }

        // Imprimir o resultado
        System.out.println("O produto escalar é: " + produtoEscalar);
    }
}
