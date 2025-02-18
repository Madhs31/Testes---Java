import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] pares = new int[10];
        int quantidade = 0, soma = 0, maior = Integer.MIN_VALUE;

        // Ler 10 números e armazenar apenas os pares
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                pares[quantidade] = numero;
                soma += numero;
                if (numero > maior) {
                    maior = numero;
                }
                quantidade++;
            }
        }

        // Imprimir a quantidade de valores armazenados, o maior valor e a média
        System.out.println("Quantidade de valores armazenados: " + quantidade);
        System.out.println("Maior valor encontrado: " + maior);
        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("Média dos valores: " + media);
        }
    }
}
