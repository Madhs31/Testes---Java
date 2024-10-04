package Atividade3;

// heranca
class Funcionario {
    protected String nome;
    protected int cpf;
    protected double salario;

    //constructor
    public Funcionario(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    //get
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }
}

