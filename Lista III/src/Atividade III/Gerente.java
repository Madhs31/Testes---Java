package Atividade3;

class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, int cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}
