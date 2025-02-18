import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = {2, 5, 4, 54, 43, 22, 5, 9, 30, 15};

        // Ler o valor X
        System.out.print("Digite um valor para buscar: ");
        int x = scanner.nextInt();
        boolean encontrado = false;

        // Buscar X no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                System.out.println("Valor encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Valor não encontrado.");
        }
    }
}
