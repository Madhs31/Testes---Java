import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Ler 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            numeros[i] = scanner.nextInt();
        }

        // Imprimir os valores
        System.out.println("Os números maiores ou iguais a 20 são:");
        for (int numero : numeros) {
            if (numero >= 20) {
                System.out.print(numero + " ");
            }
        }
    }
}
