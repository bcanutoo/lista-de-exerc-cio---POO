import java.util.Scanner;

public class Questao21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência Fibonacci deseja: ");
        int n = sc.nextInt();

        int a = 0, b = 1;
        System.out.print("Sequência: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        sc.close();
    }
}
