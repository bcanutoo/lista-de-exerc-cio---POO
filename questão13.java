import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int SENHA_CORRETA = 1234; // senha definida
        int senhaDigitada;

        do {
            System.out.print("Digite a senha: ");
            senhaDigitada = sc.nextInt();

            if (senhaDigitada != SENHA_CORRETA) {
                System.out.println("Senha incorreta, tente novamente.");
            }
        } while (senhaDigitada != SENHA_CORRETA);

        System.out.println("Senha correta! Bem-vindo ao sistema.");

        sc.close();
    }
}
