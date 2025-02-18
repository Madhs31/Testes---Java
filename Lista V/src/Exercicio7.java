import java.io.*;

public class Exercicio7 {
    public static void criptografar(String entrada, String saida) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(entrada));
             FileWriter writer = new FileWriter(saida)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                StringBuilder linhaCripto = new StringBuilder();
                for (char c : linha.toCharArray()) {
                    linhaCripto.append((char) (c + 1));
                }
                writer.write(linhaCripto.toString() + "\n");
            }
        }
        System.out.println("Arquivo criptografado com sucesso: " + saida);
    }

    public static void descriptografar(String entrada, String saida) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(entrada));
             FileWriter writer = new FileWriter(saida)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                StringBuilder linhaDescripto = new StringBuilder();
                for (char c : linha.toCharArray()) {
                    linhaDescripto.append((char) (c - 1));
                }
                writer.write(linhaDescripto.toString() + "\n");
            }
        }
        System.out.println("Arquivo descriptografado com sucesso: " + saida);
    }

    public static void main(String[] args) {
        try {
            criptografar("alunos.txt", "texto_criptografado.txt");
            descriptografar("texto_criptografado.txt", "texto_descriptografado.txt");
        } catch (IOException e) {
            System.err.println("Ocorreu um erro: " + e.getMessage());
        }
    }
}