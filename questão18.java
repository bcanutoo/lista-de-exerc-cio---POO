import java.util.Scanner;

public class Questao18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int linhas = sc.nextInt();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
