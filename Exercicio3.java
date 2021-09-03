package Atividades;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, total21 = 0, total50 = 0;
		
		while (idade<100) {
			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();
			
			if(idade<21) {
				total21++;
				}
			else if (idade>50) {
				total50++;
			}
			else if(idade <1) {
				System.out.println("Idade incorreta");
			}
			
			System.out.println("Total de pessoas com 21 anos é de: " + total21);
			System.out.println("Total de pessoas com mais de 50 é de: " + total50);
		}
		
		leia.close();

	}

}
