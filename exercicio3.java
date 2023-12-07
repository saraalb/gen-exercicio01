package exercicios01;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		//variaveis
		float salarioBruto, addNoturno, horasExtras, descontos, salarioLiq;
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada
		System.out.println("Digite o salário bruto: R$");
		salarioBruto = leia.nextFloat();
		System.out.println("Digite o adicional noturno: R$");
		addNoturno = leia.nextFloat();
		System.out.println("Digite as horas extras: ");
		horasExtras = leia.nextFloat();
		System.out.println("Digite os descontos: R$");
		descontos = leia.nextFloat();
		
		//processamento
		salarioLiq = salarioBruto + addNoturno + (horasExtras*5) - descontos;
		
		//dados de saida
		System.out.printf("O saláro líquido foi de: %.2f", salarioLiq);
	}

}
