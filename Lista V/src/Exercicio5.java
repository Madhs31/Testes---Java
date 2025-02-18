import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];
        double[] nota1 = new double[10];
        double[] nota2 = new double[10];
        double[] medias = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome do aluno " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.print("Nota 1: ");
            nota1[i] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            nota2[i] = scanner.nextDouble();
            scanner.nextLine();

            medias[i] = (nota1[i] + nota2[i]) / 2;
        }

        try (FileWriter writer = new FileWriter("alunos.txt")) {
            for (int i = 0; i < 10; i++) {
                writer.write(String.format("%s - Nota1: %.2f, Nota2: %.2f, Média: %.2f%n", nomes[i], nota1[i], nota2[i], medias[i]));
            }
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}