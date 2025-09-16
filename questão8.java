import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada
        System.out.print("Digite o código (1-4): ");
        int codigo = sc.nextInt();

        System.out.print("Digite o valor de x: ");
        double x = sc.nextDouble();

        System.out.print("Digite o valor de y: ");
        double y = sc.nextDouble();

        double resultado = 0;

        try {
            switch (codigo) {
                case 1:
                    if (y == 0) {
                        throw new ArithmeticException("Divisão por zero!");
                    }
                    resultado = Math.pow(x, 3) + ((x * (2 * y - x)) / Math.pow(y, 2));
                    break;
                case 2:
                    if (x * y == 0) {
                        throw new ArithmeticException("Divisão por zero!");
                    }
                    resultado = (Math.sqrt(Math.pow(x, 3) + Math.pow(y, 3)) + (Math.pow(x, 3) - Math.pow(y, 3))) / (x * y);
                    break;
                case 3:
                    resultado = 2 * x + Math.sqrt(x * y);
                    break;
                case 4:
                    resultado = Math.sin(x) + Math.cos(y);
                    break;
                default:
                    System.out.println("Código inválido!");
                    sc.close();
                    return;
            }

            // Saída
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro na operação: " + e.getMessage());
        }

        sc.close();
    }
}
