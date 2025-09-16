import java.util.Scanner;

public class ArranjoCombinacao {

    // Método para calcular fatorial
    public static long fatorial(int n) {
        long fat = 1;
        for (int i = 2; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    // Método para calcular Arranjo A(n,p) = n! / (n-p)!
    public static long arranjo(int n, int p) {
        return fatorial(n) / fatorial(n - p);
    }

    // Método para calcular Combinação C(n,p) = n! / (p! * (n-p)!)
    public static long combinacao(int n, int p) {
        return fatorial(n) / (fatorial(p) * fatorial(n - p));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, p;

        // Entrada de dados com validação
        do {
            System.out.print("Informe N (total de elementos): ");
            n = sc.nextInt();
            System.out.print("Informe P (número de elementos tomados de cada vez): ");
            p = sc.nextInt();

            if (p > n || n <= 0 || p <= 0) {
                System.out.println("Erro: N e P devem ser positivos e P <= N. Tente novamente.");
            }
        } while (p > n || n <= 0 || p <= 0);

        // Calculando Arranjo e Combinação
        long A = arranjo(n, p);
        long C = combinacao(n, p);

        // Exibindo resultados
        System.out.println("Arranjo A(" + n + "," + p + ") = " + A);
        System.out.println("Combinação C(" + n + "," + p + ") = " + C);

        sc.close();
    }
}