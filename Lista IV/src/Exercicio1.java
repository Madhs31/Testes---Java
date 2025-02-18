import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número:");
            num[i] = sc.nextInt();
        }
        System.out.println("Os números digitados foram:");
        for (int i = 0; i < 10; i++) {
            System.out.print(num[i] + " ");
        }
    }
}
