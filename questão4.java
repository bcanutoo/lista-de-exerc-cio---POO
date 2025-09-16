/* [4] Desenvolver um programa que calcule o salário bruto e o salário líquido de um funcionário.
• Dados de Entrada: Matrícula do funcionário (int); Quantidade de horas-extras
trabalhadas.
• Constantes: 
•  Salário Mínimo = R$ 788.00; Valor da Hora-Extra = R$ 10.00.
•  Sabe-se:
• Salário hora-extra = horas-extras * Valor da Hora-Extra;
• Salário bruto = 3 * Salário Mínimo + Salário hora-extra;
• Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$
1500,00;
• Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for
maior que R$ 2000,00; 
• Salário líquido = salário bruto – deduções.*/

package lista2;

import java.util.Scanner;

public class exercicio4 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int matricula;
		
		float horasExtras,
			  salarioMinimo = 788f,
			  valorHoraExtra = 10f,
			  salarioHoraExtra = 0f,   //Salário hora-extra = horas-extras * Valor da Hora-Extra
			  salarioBruto = 0f,       //Salário bruto = 3 * Salário Mínimo + Salário hora-extra
			  salarioLiquido = 0f,	   //Salário líquido = salário bruto – deduções
			  descInss = 0f,		   //Desconto INSS = 12 % do salário bruto, se salário bruto for maior que R$ 1500,00;
			  descImpostoDeRenda = 0f; //Desconto do Imposto de Renda = 20 % do Salário Bruto, se o mesmo for maior que R$ 2000,00; • Salário líquido = salário bruto – deduções.*/
		
		 salarioMinimo = salarioMinimo* 3;
		 
		System.out.println("##############################################");
		System.out.println("##### programa para calculo de salario ######");
		System.out.println("##############################################");
		System.out.println("");
		
		System.out.println("Digite o numero de sua matricula: ");
		matricula = input.nextInt();
		
		System.out.println("Digite o valor das suas horas extras trabalhadas: ");
		horasExtras = input.nextFloat();
		
		salarioHoraExtra = horasExtras * valorHoraExtra;
		 
//		System.out.printf("Horas extras %.2f Valor ganho por horas extras %.2f salario minimo %f",horasExtras,salarioHoraExtra,salarioMinimo);
		
		System.out.println("Horas extras: "+horasExtras+" valor ganho por horas extras: "+salarioHoraExtra);
		salarioBruto = salarioMinimo + salarioHoraExtra;
		
		if(salarioBruto <= 1500) {
			descInss = salarioBruto * 12/100;
		}else if(salarioBruto >= 2000) {
			descImpostoDeRenda = salarioBruto * 20/100;
		}
		
		salarioLiquido = salarioBruto - descImpostoDeRenda - descInss;
		
		System.out.printf(" Salario liquido = %.2f Salario bruto = %.2f Desconto Inss = %.2f Desconto %.2f ",salarioLiquido, salarioBruto, descInss, descImpostoDeRenda);
	}
	
}