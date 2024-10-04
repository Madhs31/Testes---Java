package Atividade1;

 class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String RG, String nome, double salario) {
        super(RG, nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual) {
        this.salario += this.salario * percentual;
        return this.salario;
    }
}

