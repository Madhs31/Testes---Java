public class Exercicio7 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 6, 21};
        int[] B = {2, 3, 6, 7, 9, 11, 15, 20};

        // Imprimir elementos comuns
        System.out.println("Elementos comuns entre A e B:");
        for (int a : A) {
            for (int b : B) {
                if (a == b) {
                    System.out.print(a + " ");
                }
            }
        }
    }
}
