public class Teste {
    public static void main(String[] args) {
        // Creating the first student using the parameterized constructor
        Aluno primeiro = new Aluno(123456789, "Maria", 'F', "1231233121", "987654321");

        // Creating the second student using the parameterized constructor
        Aluno segundo = new Aluno(987654321, "Vitor", 'M', "1231233121", "123456789", );

        System.out.println("Primeiro Aluno");
        System.out.println("Ra: " + primeiro.getRa());
        System.out.println("Nome: " + primeiro.getNome());
        System.out.println("Sexo: " + primeiro.getSexo());
        System.out.println("Rg: " + primeiro.getRg());
        System.out.println("Cpf: " + primeiro.getCpf());

        System.out.println("");

        System.out.println("Segundo Aluno");
        System.out.println("Ra: " + segundo.getRa());
        System.out.println("Nome: " + segundo.getNome());
        System.out.println("Sexo: " + segundo.getSexo());
        System.out.println("Rg: " + segundo.getRg());
        System.out.println("Cpf: " + segundo.getCpf());
    }
}
