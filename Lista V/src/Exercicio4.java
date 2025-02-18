import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> linhas = new ArrayList<>();

        System.out.println("Digite o texto (digite 'FIM' para terminar):");
        while (true) {
            String linha = scanner.nextLine();
            if (linha.equals("FIM")) break;
            if (linhas.size() < 50) {
                linhas.add(linha);
            } else {
                System.out.println("Máximo de 50 linhas atingido.");
                break;
            }
        }

        try (FileWriter writer = new FileWriter("texto_usuario.txt")) {
            for (String linha : linhas) {
                writer.write(linha + "\n");
            }
            System.out.println("Arquivo salvo com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}