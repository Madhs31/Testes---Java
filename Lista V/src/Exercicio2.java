import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio2 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("dados.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}