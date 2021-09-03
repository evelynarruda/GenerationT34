package Atividades;

import java.util.Scanner;

public class Exercicio5 {
	
		public static void main(String[] args) {
			int num1 = 0, soma = 0;
			
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite ( 0 ) para concluir o loop");
			do {
				System.out.println("Digite um número: ");
				num1 = leia.nextInt();
				soma+=num1;
			}while(num1 != 0);
			leia.close();

			System.out.println("A soma dos números é: " + soma);
		}

	}

