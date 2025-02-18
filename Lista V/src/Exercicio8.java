import java.io.*;
import java.util.Scanner;

public class Exercicio8 {
        public static void main(String[] args) throws IOException {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite a palavra a ser procurada: ");
            String palavra = scanner.nextLine();

            try (BufferedReader reader = new BufferedReader(new FileReader("alunos.txt"))) {
                String linha;
                int numLinha = 1;
                boolean encontrada = false;

                while ((linha = reader.readLine()) != null) {
                    if (linha.contains(palavra)) {
                        System.out.println("Palavra encontrada na linha " + numLinha + ": " + linha);
                        encontrada = true;
                    }
                    numLinha++;
                }

                if (!encontrada) {
                    System.out.println("Palavra não encontrada no arquivo.");
                }
            }
        }
    }

