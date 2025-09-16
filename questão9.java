package lista2;
/* [9] Escreva um programa que receba dois números x e y e calcule xy . Sem utilizar a biblioteca
Math.*/
import java.util.Scanner;

public class exercicio9 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int x, y, i;
		
		System.out.println("Digite um valor para x ");
		x = input.nextInt();
		
		System.out.println("Digite um valor para y: ");
		y = input.nextInt();
		
		input.close();
		for(i = 0; i <= y; i++) {
			System.out.printf("valor de %d x %d igual a %d%n", y, i, y*i);
		}
		
		
		System.out.printf("O valor da operacao de %d elevado por %d e igual a %d", x, y, x*y);
	}
}