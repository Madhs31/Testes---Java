import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ler os números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimir os números em ordem inversa
        System.out.println("Os números na ordem inversa são:");
        for (int i = 9; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
    }
}
