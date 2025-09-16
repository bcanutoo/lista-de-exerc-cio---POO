import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int n = sc.nextInt();

        long fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }

        System.out.println("Fatorial de " + n + " = " + fatorial);
        sc.close();
    }
}
