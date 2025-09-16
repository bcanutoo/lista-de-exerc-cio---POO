/* [1 ]Crie um programa para determinar se um número inteiro A é divisível por outro número B. Os valores devem ser fornecidos pelo usuário.*/
package lista2;

import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a ,b = 0;
		
		float resultado;
		
		System.out.println("Digite um numero de valor inteiro: ");
		a = input.nextInt();
		
		System.out.println("Digite um segundo numero de valor inteiro:");
		b = input.nextInt();
		
		resultado = (float) a / b; // utilizando casting para que nao haja a perca de dados
		
		if(a % b == 0) {
			System.out.printf("O resultado de %d / %d e igual a = %.2f", a, b, resultado);
		}else if(a % b != 0) {
			System.out.printf("O resultado da divisao de %d / %d = %.2f ",a ,b ,resultado);
		}else {
			System.out.println("Houve algum problema, tente novamente");
		}
	}

}