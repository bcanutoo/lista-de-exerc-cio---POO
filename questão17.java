import java.util.Scanner;

public class Questao17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalPedido = 0;
        int codigo;

        do {
            System.out.println("\nCardápio:");
            System.out.println("1 - Cachorro quente - R$ 1.50");
            System.out.println("2 - Hamburger       - R$ 2.00");
            System.out.println("3 - Cheeseburger    - R$ 2.50");
            System.out.println("4 - Eggcheeseburger - R$ 3.00");
            System.out.println("5 - Refrigerante    - R$ 1.50");
            System.out.println("0 - Encerrar pedido");

            System.out.print("Digite o código do produto: ");
            codigo = sc.nextInt();

            if (codigo >= 1 && codigo <= 5) {
                System.out.print("Digite a quantidade: ");
                int qtd = sc.nextInt();

                double preco = 0;
                String nomeProduto = "";

                switch (codigo) {
                    case 1: preco = 1.50; nomeProduto = "Cachorro quente"; break;
                    case 2: preco = 2.00; nomeProduto = "Hamburger"; break;
                    case 3: preco = 2.50; nomeProduto = "Cheeseburger"; break;
                    case 4: preco = 3.00; nomeProduto = "Eggcheeseburger"; break;
                    case 5: preco = 1.50; nomeProduto = "Refrigerante"; break;
                }

                double subtotal = preco * qtd;
                totalPedido += subtotal;
                System.out.printf("%d x %s = R$ %.2f\n", qtd, nomeProduto, subtotal);
            } else if (codigo != 0) {
                System.out.println("Código inválido! Tente novamente.");
            }

        } while (codigo != 0);

        System.out.printf("\nTotal do pedido: R$ %.2f\n", totalPedido);

        sc.close();
    }
}
