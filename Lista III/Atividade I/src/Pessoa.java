package Atividade1;

public class Pessoa {
    private String RG;
    private String nome;

    //
    public Pessoa(String RG, String nome) {
        this.RG = RG;
        this.nome = nome;
    }

    public String getRG() {
        return RG;
    }

    public String getNome() {
        return nome;
    }
}