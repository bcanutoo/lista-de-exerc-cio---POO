import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalAlunos = 0;
        int aprovados = 0, reprovados = 0, exame = 0;
        double somaMedias = 0;

        String nomeMaior = "", nomeMenor = "";
        double maiorMedia = -1, menorMedia = 11;

        String continuar;

        do {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();

            double nota1, nota2;

            // Validação da nota 1
            do {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = sc.nextDouble();
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("ERRO: Nota inválida!");
                }
            } while (nota1 < 0 || nota1 > 10);

            // Validação da nota 2
            do {
                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = sc.nextDouble();
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("ERRO: Nota inválida!");
                }
            } while (nota2 < 0 || nota2 > 10);

            double media = (nota1 + nota2) / 2.0;
            System.out.printf("Média do aluno %s = %.2f\n", nome, media);

            // Classificação do aluno
            if (media < 3) {
                System.out.println("Situação: Reprovado");
                reprovados++;
            } else if (media < 7) {
                System.out.println("Situação: Exame");
                exame++;
            } else {
                System.out.println("Situação: Aprovado");
                aprovados++;
            }

            // Atualiza estatísticas
            somaMedias += media;
            totalAlunos++;

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaior = nome;
            }
            if (media < menorMedia) {
                menorMedia = media;
                nomeMenor = nome;
            }

            sc.nextLine(); // limpar buffer
            System.out.print("Deseja cadastrar outro aluno? (sim/nao): ");
            continuar = sc.nextLine();

        } while (continuar.equalsIgnoreCase("sim"));

        // Relatório final
        if (totalAlunos > 0) {
            double mediaClasse = somaMedias / totalAlunos;
            System.out.println("\n===== RELATÓRIO FINAL =====");
            System.out.println("Total de alunos: " + totalAlunos);
            System.out.println("Aprovados: " + aprovados);
            System.out.println("Exame: " + exame);
            System.out.println("Reprovados: " + reprovados);
            System.out.printf("Média da classe: %.2f\n", mediaClasse);
            System.out.printf("Maior média: %.2f - Aluno: %s\n", maiorMedia, nomeMaior);
            System.out.printf("Menor média: %.2f - Aluno: %s\n", menorMedia, nomeMenor);
        } else {
            System.out.println("Nenhum aluno foi cadastrado.");
        }

        sc.close();
    }
}
