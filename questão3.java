/* [3] Escreva um programa que leia o valor da compra e imprima o valor da venda de acordo com a
tabela a seguir. Cuidado com valor inválido de compra: 

Valor da Compra Valor da Venda
Valor < R$ 10,00 Lucro de 70%
R$ 10,00 <= Valor < R$ 30,00 Lucro de 50%
R$ 30,00 <= Valor < R$ 50,00 Lucro de 40%
Valor >= R$ 50,00 Lucro de 30% */

package lista2;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double precoProd = 0.0;
		char desconto = '0';

		System.out.println("Digite o valor do produto: ");
		precoProd = input.nextDouble();

		if (precoProd <= 10.0) {
			System.out.printf("O valor da compra foi de %.2f %n", precoProd);
			desconto = '7';
		} else if (precoProd < 30.0) {
			System.out.printf("O valor da compra foi de %,2f %n", precoProd);
			desconto = '5';
		} else if (precoProd < 50) {
			System.out.printf("O valor da compra foi de %.2f", precoProd);
			desconto = '4';
		} else {
			System.out.printf("O valor da compra foi de %.2f", precoProd);
			desconto = '3';
		}

		switch (desconto) {
			case '7': {
			System.out.println(" O lucro da venda sera de 70 ");
			break;
		}
		case '5': {
			System.out.println(" O lucro sera de 50% ");
			break;
		}
		case '4': {
			System.out.println("O lucro sera de 40%");
			break;
		}
		case '3': {
			System.out.println(" O lucro sera de 30%");
			break;
		}

		}
	}
}