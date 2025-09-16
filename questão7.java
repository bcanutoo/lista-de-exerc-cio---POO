import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o salário do funcionário: ");
        double salario = sc.nextDouble();

        System.out.print("Digite o código do cargo (1-5): ");
        int codigo = sc.nextInt();

        String cargo = "";
        double percentual = 0;

        // Verificação do cargo e percentual
        switch (codigo) {
            case 1:
                cargo = "Escriturário";
                percentual = 50;
                break;
            case 2:
                cargo = "Secretário";
                percentual = 35;
                break;
            case 3:
                cargo = "Caixa";
                percentual = 20;
                break;
            case 4:
                cargo = "Gerente";
                percentual = 10;
                break;
            case 5:
                cargo = "Diretor";
                percentual = 0;
                break;
            default:
                System.out.println("Código inválido!");
                sc.close();
                return; // encerra o programa
        }

        // Cálculo do aumento
        double aumento = salario * (percentual / 100);
        double novoSalario = salario + aumento;

        // Saída
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário atual: R$ " + salario);
        System.out.println("Percentual de aumento: " + percentual + "%");
        System.out.println("Valor do aumento: R$ " + aumento);
        System.out.println("Novo salário: R$ " + novoSalario);

        sc.close();
    }
}
