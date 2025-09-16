import java.util.Scanner;

public class Questao26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        
        for (int i = 0; i < 10; i++) {
            boolean repetido;
            do {
                System.out.print("Digite o elemento " + (i+1) + ": ");
                int num = sc.nextInt();
                repetido = false;
                
                // Verifica se já existe
                for (int j = 0; j < i; j++) {
                    if (vetor[j] == num) {
                        repetido = true;
                        System.out.println("Número repetido! Digite outro.");
                        break;
                    }
                }
                
                if (!repetido) vetor[i] = num;
            } while (repetido);
        }
        
        System.out.println("Vetor final:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
    }
}
