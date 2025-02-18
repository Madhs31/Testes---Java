import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exercicio3 {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ferna\\IdeaProjects\\Lista5\\out\\production\\Lista5\\Exercicio1.class"))) {
            String linha;
            int numLinha = 1;
            while ((linha = reader.readLine()) != null) {
                System.out.println(numLinha + ": " + linha);
                numLinha++;
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}