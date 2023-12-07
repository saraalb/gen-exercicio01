package exercicios01;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		//declaracao de variaveis
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite nota 1: \n");
		nota1 = leia.nextFloat();
		System.out.println("Digite nota 2: \n");
		nota2 = leia.nextFloat();
		System.out.println("Digite nota 3: \n");
		nota3 = leia.nextFloat();
		System.out.println("Digite nota 4: \n");
		nota4 = leia.nextFloat();
		
		media = (nota1+nota2+nota3+nota4)/4;
		
		System.out.printf("Sua média é: %.1f", media);
		

	}

}
