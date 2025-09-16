import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        if (ehPalindromo(numero)) {
            System.out.println(numero + " é um palíndromo!");
        } else {
            System.out.println(numero + " não é um palíndromo.");
        }

        sc.close();
    }

    public static boolean ehPalindromo(int num) {
        int original = num, invertido = 0;

        while (num > 0) {
            int digito = num % 10;
            invertido = invertido * 10 + digito;
            num /= 10;
        }

        return original == invertido;
    }
}
