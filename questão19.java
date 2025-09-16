import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas do triângulo: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            // Espaços em branco antes dos asteriscos
            for (int j = 1; j <= (linhas - i); j++) {
                System.out.print(" ");
            }
            // Asteriscos
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
