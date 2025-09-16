import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Valor inválido! O número deve ser não negativo.");
        } else {
            long fatorial = 1; // long para suportar números maiores
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
            System.out.println("Fatorial de " + n + " = " +
