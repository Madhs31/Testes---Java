package Atividade1;

public class Main {
    public static void main(String[] args) {
                Funcionario f1 = new Funcionario("123456789", "João", 3000.0);
                System.out.println("Salário antes do aumento: " + f1.getSalario());
                f1.aumentarSalario(0.10);
                System.out.println("Salário após aumento de 10%: " + f1.getSalario());
            }
        }