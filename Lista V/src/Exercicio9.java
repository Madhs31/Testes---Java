import java.io.*;

public class Exercicio9 {
        public static void main(String[] args) throws IOException {
            try (BufferedReader reader = new BufferedReader(new FileReader("arquivo.html"));
                 FileWriter writer = new FileWriter("arquivo_sem_tags.txt")) {
                String linha;
                while ((linha = reader.readLine()) != null) {
                    linha = linha.replaceAll("<[^>]*>", "");  // Remove tags HTML
                    writer.write(linha + "\n");
                }
            }
            System.out.println("Arquivo gerado sem as tags HTML.");
        }
    }

