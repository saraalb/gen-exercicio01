package exercicios01;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//declaracao de variaveis
		float salario,abono, novoSalario;
	
		Scanner leia = new Scanner(System.in);
		
		//dados de entrada
		System.out.println("Digite o salário: \n");
		salario = leia.nextFloat();
		System.out.println("Digite o abono: \n");
		abono = leia.nextFloat();
		System.out.println();
		
		novoSalario = salario + abono;
		
		//dados de saida
		System.out.println("O novo salário é de r$"+ novoSalario);
		

	}

}
