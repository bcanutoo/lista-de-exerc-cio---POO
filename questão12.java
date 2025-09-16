import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String continuar;
        do {
            System.out.print("Entre com o nome do aluno: ");
            String nome = sc.nextLine();

            double notaA, notaB;

            // Lê nota A com validação
            do {
                System.out.print("Entre com o grau A: ");
                notaA = sc.nextDouble();
                if (notaA < 0 || notaA > 10) {
                    System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
                }
            } while (notaA < 0 || notaA > 10);

            // Lê nota B com validação
            do {
                System.out.print("Entre com o grau B: ");
                notaB = sc.nextDouble();
                if (notaB < 0 || notaB > 10) {
                    System.out.println("ERRO: Nota inválida! Digite novamente a nota.");
                }
            } while (notaB < 0 || notaB > 10);

            double media = (notaA + notaB) / 2.0;

            System.out.printf("O aluno %s tem uma média: %.2f\n", nome, media);

            sc.nextLine(); // limpar buffer
            System.out.print("Continuar (sim/nao)? ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        sc.close();
    }
}
