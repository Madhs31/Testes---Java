package Atividade2;

public class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("Nemo", 0.5, "Água Salgada");
        Peixe peixe2 = new Peixe("Dory", 0.4, "Água Doce");
        Cachorro cachorro1 = new Cachorro("Rex", 10.0, "Labrador");
        Cachorro cachorro2 = new Cachorro("Spike", 12.0, "Bulldog");

        System.out.println("Peixe 1: " + peixe1.getNome() + ", Habitat: " + peixe1.getTipoHabitat());
        System.out.println("Peixe 2: " + peixe2.getNome() + ", Habitat: " + peixe2.getTipoHabitat());
        System.out.println("Cachorro 1: " + cachorro1.getNome() + ", Raça: " + cachorro1.getRaca());
        System.out.println("Cachorro 2: " + cachorro2.getNome() + ", Raça: " + cachorro2.getRaca());
    }
}
