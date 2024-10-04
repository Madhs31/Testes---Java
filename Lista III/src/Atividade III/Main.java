package Atividade3;

public class Main {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Ana", 123456789, 5000.0, 1234);
        Gerente gerente2 = new Gerente("Carlos", 987654321, 6000.0, 5678);

        System.out.println("Gerente 1: " + gerente1.getNome() + ", CPF: " + gerente1.getCpf() + ", Salário: " + gerente1.getSalario());
        System.out.println("Gerente 2: " + gerente2.getNome() + ", CPF: " + gerente2.getCpf() + ", Salário: " + gerente2.getSalario());

        System.out.println("Autenticando Gerente 1 com senha 1234: " + gerente1.autentica(1234));
        System.out.println("Autenticando Gerente 2 com senha 1234: " + gerente2.autentica(1234));
    }
}
