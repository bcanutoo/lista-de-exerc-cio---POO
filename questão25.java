import java.util.Scanner;

public class Questao25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double[] V1 = new double[5];
        double[] V2 = new double[5];
        char[] Op = new char[5];
        double[] Resul = new double[5];
        
        System.out.println("Digite os valores de V1:");
        for (int i = 0; i < 5; i++) {
            V1[i] = sc.nextDouble();
        }
        
        System.out.println("Digite os valores de V2:");
        for (int i = 0; i < 5; i++) {
            V2[i] = sc.nextDouble();
        }
        
        System.out.println("Digite as operações (+ - * /) para cada posição:");
        for (int i = 0; i < 5; i++) {
            Op[i] = sc.next().charAt(0);
        }
        
        // Calcula resultados
        for (int i = 0; i < 5; i++) {
            switch(Op[i]) {
                case '+': Resul[i] = V1[i] + V2[i]; break;
                case '-': Resul[i] = V1[i] - V2[i]; break;
                case '*': Resul[i] = V1[i] * V2[i]; break;
                case '/': 
                    if (V2[i] != 0) Resul[i] = V1[i] / V2[i]; 
                    else System.out.println("Divisão por zero na posição " + i);
                    break;
                default: System.out.println("Operação inválida na posição " + i);
            }
        }
        
        System.out.println("Resultados:");
        for (double r : Resul) {
            System.out.print(r + " ");
        }
    }
}
