import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio11 {

    static class Contato {
        String nome;
        String email;
        String endereco;
        String telefone;
        String dataAniversario;
        String observacao;

        public Contato(String nome, String email, String endereco, String telefone, String dataAniversario, String observacao) {
            this.nome = nome;
            this.email = email;
            this.endereco = endereco;
            this.telefone = telefone;
            this.dataAniversario = dataAniversario;
            this.observacao = observacao;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + "\nE-mail: " + email + "\nEndereço: " + endereco + "\nTelefone: " + telefone +
                    "\nData de Aniversário: " + dataAniversario + "\nObservações: " + observacao + "\n";
        }

        public String toFileString() {
            return nome + "\n" + email + "\n" + endereco + "\n" + telefone + "\n" + dataAniversario + "\n" + observacao + "\n";
        }
    }

    public static void main(String[] args) {
        ArrayList<Contato> agenda = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        File arquivo = new File("agenda.txt");
        if (!arquivo.exists()) {
            try {
                arquivo.createNewFile();  // Cria um arquivo vazio se não existir
            } catch (IOException e) {
                System.err.println("Erro ao criar o arquivo: " + e.getMessage());
            }
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("agenda.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String nome = linha;
                String email = reader.readLine();
                String endereco = reader.readLine();
                String telefone = reader.readLine();
                String dataAniversario = reader.readLine();
                String observacao = reader.readLine();

                if (email != null && endereco != null && telefone != null && dataAniversario != null && observacao != null) {
                    agenda.add(new Contato(nome, email, endereco, telefone, dataAniversario, observacao));
                } else {
                    System.err.println("Erro: dados incompletos no arquivo.");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.err.println("Erro: arquivo 'agenda.txt' não encontrado.");
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        String resposta = "";
        while (!resposta.equalsIgnoreCase("N")) {
            System.out.print("Deseja adicionar um novo contato? (S/N): ");
            resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("S")) {
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("E-mail: ");
                String email = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Data de Aniversário: ");
                String dataAniversario = scanner.nextLine();
                System.out.print("Observação: ");
                String observacao = scanner.nextLine();

                Contato novoContato = new Contato(nome, email, endereco, telefone, dataAniversario, observacao);
                agenda.add(novoContato);

                try (BufferedWriter writer = new BufferedWriter(new FileWriter("agenda.txt", true))) {
                    writer.write(novoContato.toFileString());  // Adiciona o novo contato no final do arquivo
                    writer.flush();
                } catch (IOException e) {
                    System.err.println("Erro ao salvar o contato no arquivo: " + e.getMessage());
                }
            }
        }

        System.out.print("Digite o primeiro nome que deseja buscar: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (Contato p : agenda) {
            if (p.nome.toLowerCase().contains(nomeBusca.toLowerCase())) {
                System.out.println("\n" + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhum contato encontrado com o nome informado.");
        }
    }
}
