import java.io.FileWriter;
import java.io.IOException;

public class Exercicio1 {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("dados.txt")) {
            for (int i = 1; i <= 100; i++) {
                writer.write(i + "\n");
            }
            System.out.println("Arquivo criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
