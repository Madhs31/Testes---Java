import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio6 {
    public static void main(String[] args) {
        double somaMedias = 0;
        int contador = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
                String[] partes = linha.split("Média: ");
                somaMedias += Double.parseDouble(partes[1]);
                contador++;
            }
            double mediaGeral = somaMedias / contador;
            System.out.printf("Média geral da turma: %.2f%n", mediaGeral);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}