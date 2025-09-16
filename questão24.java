import java.util.Scanner;

public class Questao24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        
        System.out.print("Digite um código inteiro (0 para sair, 1 ou 2): ");
        int codigo = sc.nextInt();
        
        if (codigo == 0) {
            System.out.println("Programa encerrado.");
            return;
        }
        
        // Leitura do vetor
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o elemento " + (i+1) + ": ");
            vetor[i] = sc.nextDouble();
        }
        
        if (codigo == 1) {
            System.out.println("Vetor na ordem direta:");
            for (double num : vetor) {
                System.out.print(num + " ");
            }
        } else if (codigo == 2) {
            System.out.println("Vetor na ordem inversa:");
            for (int i = vetor.length - 1; i >= 0; i--) {
                System.out.print(vetor[i] + " ");
            }
        } else {
            System.out.println("Código inválido!");
        }
    }
}
