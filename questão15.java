import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0.0;
        char opcao;

        do {
            System.out.println("\nOpções:");
            System.out.println("(a) consulta saldo");
            System.out.println("(b) saque");
            System.out.println("(c) depósito");
            System.out.println("(d) sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.next().toLowerCase().charAt(0);

            switch (opcao) {
                case 'a':
                    System.out.printf("Saldo atual: R$ %.2f\n", saldo);
                    break;

                case 'b':
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saque realizado. Saldo atual: R$ %.2f\n", saldo);
                    }
                    break;

                case 'c':
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = sc.nextDouble();
                    if (deposito <= 0) {
                        System.out.println("Valor inválido para depósito.");
                    } else {
                        saldo += deposito;
                        System.out.printf("Depósito realizado. Saldo atual: R$ %.2f\n", saldo);
                    }
                    break;

                case 'd':
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 'd');

        sc.close();
    }
}
