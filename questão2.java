/* [2] Crie um algoritmo que peça a idade do eleitor e o mesmo informe se o eleitor é facultativo
(entre 16 e 17 anos) ou obrigatório (entre 18 a 65) ou dispensado (acima de 65).*/

package lista2;

import java.util.Scanner; 

public class exercicio2 {
	
	public static void main(String[] args) {
		
		String nome;
		int idade;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual o seu nome? ");
		nome = input.next();
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		if (idade <= 17) { 
			System.out.printf("%s voce e facultativo por ter %d anos",nome,idade);
		}else if (idade <= 18 | idade <= 65) {
			System.out.printf("%s voce e obrigado a votar por ter %d anos", nome, idade);
		}else {
			System.out.printf("%s voce nao e obrigado a votar, por ter %d anos", nome, idade);
		}
	}
}