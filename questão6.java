package lista2;

import java.util.Scanner;

/* Escreva um algoritmo que leia o código de um determinado produto e mostre a sua
classificação de acordo com a tabela apresentada a seguir:
 
codigo   	| classificacao 
1                 Alimento nao perecivel 
2, 3 ou 4         Alimento perecivel
5 ou 6			  Vestuario
7                 Higiene pessoal 
8 ate 15          Limpeza e utensilios domesticos
Qualquer outro    Invalido
*/


public class exercicio6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int codigoProduto;
		String resposta;
		
		System.out.print("Digite o codigo do produto: ");
		codigoProduto = input.nextInt();
		
		resposta = switch (codigoProduto) {
		case 1 -> "alimento perecivel";
		case 2, 3, 4 -> "Alimento perecivel";
		case 5, 6 -> "Vestuario";
		case 7 -> "Higiene pessoal";
		case 8,9,10, 11, 12, 13, 14, 15 -> "Limpeza";
		
		default -> " que nao existe";
//		throw new IllegalArgumentException("Nao nenhum codigo para o produto codigo " + codigoProduto);
		};
		
	System.out.printf("O produto %d e um produto %s", codigoProduto, resposta);
	}

}