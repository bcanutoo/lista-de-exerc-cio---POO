import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entradas
        System.out.print("Digite o valor do divisor: ");
        int divisor = sc.nextInt();

        if (divisor == 0) {
            System.out.println("Erro: divisor não pode ser zero!");
            sc.close();
            return;
        }

        System.out.print("Digite o início do intervalo: ");
        int inicio = sc.nextInt();

        System.out.print("Digite o fim do intervalo: ");
        int fim = sc.nextInt();

        if (fim < inicio) {
            System.out.println("Erro: o fim do intervalo deve ser maior ou igual ao início.");
            sc.close();
            return;
        }

        System.out.print("Números divisíveis por " + divisor +
                         " no intervalo de " + inicio + " a " + fim + ": ");

        boolean encontrou = false;
        for (int i = inicio; i <= fim; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.print("Nenhum número encontrado.");
        }

        System.out.println(); // quebra de linha
        sc.close();
    }
}
