import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class VetoresOperacoes {

    // Método para sortear número aleatório entre limitInf e limitSup
    public static int sorteia(int limitInf, int limitSup) {
        Random rand = new Random();
        return rand.nextInt(limitSup - limitInf + 1) + limitInf;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limitInf, limitSup;

        // Entrada e validação dos limites
        do {
            System.out.print("Informe o limite inferior: ");
            limitInf = sc.nextInt();
            System.out.print("Informe o limite superior: ");
            limitSup = sc.nextInt();

            if (limitInf >= limitSup) {
                System.out.println("O limite inferior deve ser menor que o superior. Tente novamente.");
            }
        } while (limitInf >= limitSup);

        int tamanho = 10;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        // Preenchendo os vetores A e B aleatoriamente
        for (int i = 0; i < tamanho; i++) {
            A[i] = sorteia(limitInf, limitSup);
            B[i] = sorteia(limitInf, limitSup);
        }

        // Vetor Soma
        int[] Soma = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            Soma[i] = A[i] + B[i];
        }

        // Vetor Intersecção
        ArrayList<Integer> IntersecaoList = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (A[i] == B[j] && !IntersecaoList.contains(A[i])) {
                    IntersecaoList.add(A[i]);
                }
            }
        }
        int[] Intersecao = IntersecaoList.stream().mapToInt(Integer::intValue).toArray();

        // Vetor Diferença (A - B)
        ArrayList<Integer> DiferencaList = new ArrayList<>();
        for (int i = 0; i < tamanho; i++) {
            boolean found = false;
            for (int j = 0; j < tamanho; j++) {
                if (A[i] == B[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                DiferencaList.add(A[i]);
            }
        }
        int[] Diferenca = DiferencaList.stream().mapToInt(Integer::intValue).toArray();

        // Vetor Intercalação
        int[] Intercalacao = new int[tamanho * 2];
        for (int i = 0; i < tamanho; i++) {
            Intercalacao[2 * i] = A[i];
            Intercalacao[2 * i + 1] = B[i];
        }

        // Exibindo os resultados
        System.out.println("Vetor A: ");
        for (int num : A) System.out.print(num + " ");
        System.out.println("\nVetor B: ");
        for (int num : B) System.out.print(num + " ");
        System.out.println("\nVetor Soma: ");
        for (int num : Soma) System.out.print(num + " ");
        System.out.println("\nVetor Intersecao: ");
        for (int num : Intersecao) System.out.print(num + " ");
        System.out.println("\nVetor Diferenca (A - B): ");
        for (int num : Diferenca) System.out.print(num + " ");
        System.out.println("\nVetor Intercalacao: ");
        for (int num : Intercalacao) System.out.print(num + " ");

        sc.close();
    }
}