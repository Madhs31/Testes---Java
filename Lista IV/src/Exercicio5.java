import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[8];

        // Ler os 8 números
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = scanner.nextInt();
        }

        // Trocar os 4 primeiros pelos 4 últimos
        for (int i = 0; i < 4; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[i + 4];
            vetor[i + 4] = temp;
        }

        // Imprimir o vetor trocado
        System.out.println("Vetor trocado:");
        for (int numero : vetor) {
            System.out.print(numero + " ");
        }
    }
}
