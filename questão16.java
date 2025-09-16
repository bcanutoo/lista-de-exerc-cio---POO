import java.util.Scanner;

public class Questao16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número N: ");
        int n = sc.nextInt();

        System.out.println("Números primos até " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean ehPrimo(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
