import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> linhas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try (BufferedReader reader = new BufferedReader(new FileReader("texto.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                linhas.add(linha);
            }
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nMenu:");
            System.out.println("1. Listar");
            System.out.println("2. Editar");
            System.out.println("3. Inserir");
            System.out.println("4. Apagar");
            System.out.println("5. Abandonar");
            System.out.println("6. Sair e Salvar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a linha inicial: ");
                    int inicio = scanner.nextInt();
                    System.out.print("Digite a linha final: ");
                    int fim = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = inicio - 1; i < fim; i++) {
                        if (i >= 0 && i < linhas.size()) {
                            System.out.println((i + 1) + ": " + linhas.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.print("Digite o número da linha a ser editada: ");
                    int linhaEditar = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (linhaEditar >= 0 && linhaEditar < linhas.size()) {
                        System.out.println("Conteúdo atual: " + linhas.get(linhaEditar));
                        System.out.print("Digite o novo conteúdo: ");
                        String novoConteudo = scanner.nextLine();
                        linhas.set(linhaEditar, novoConteudo);
                    }
                    break;
                case 3:
                    System.out.print("Digite após qual linha inserir: ");
                    int linhaInserir = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Digite o novo conteúdo: ");
                    String conteudoInserir = scanner.nextLine();
                    if (linhaInserir >= 0 && linhaInserir <= linhas.size()) {
                        linhas.add(linhaInserir, conteudoInserir);
                    }
                    break;
                case 4:
                    System.out.print("Digite o número da linha a ser apagada: ");
                    int linhaApagar = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (linhaApagar >= 0 && linhaApagar < linhas.size()) {
                        System.out.println("Conteúdo: " + linhas.get(linhaApagar));
                        System.out.print("Confirmar remoção (s/n)? ");
                        String confirmacao = scanner.nextLine();
                        if (confirmacao.equalsIgnoreCase("s")) {
                            linhas.remove(linhaApagar);
                        }
                    }
                    break;
                case 5:
                    System.out.print("Tem certeza que deseja abandonar sem salvar (s/n)? ");
                    String abandonar = scanner.nextLine();
                    if (abandonar.equalsIgnoreCase("s")) {
                        continuar = false;
                    }
                    break;
                case 6:
                    System.out.print("Tem certeza que deseja sair e salvar (s/n)? ");
                    String salvar = scanner.nextLine();
                    if (salvar.equalsIgnoreCase("s")) {
                        try (FileWriter writer = new FileWriter("texto.txt")) {
                            for (String l : linhas) {
                                writer.write(l + "\n");
                            }
                        }
                        continuar = false;
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}

