package Atividades;

import java.util.Scanner;

public class Exercicio4 {

			public static void main(String[] args) {
			int cont_pessoa = 0, cont_pessoaCalma = 0, cont_mulherNervosa = 0, cont_homemAgressivo = 0, cont_outroCalmo = 0, cont_nervoso40 = 0, cont_calmo18 = 0;
			int idade = 0, genero = 0, estado = 0;
			
			Scanner leia = new Scanner(System.in);
			
			
			do {
				System.out.println("Digite seu gênero (1 = Masculino | 2 = Feminino | 3 = Outro) :");
				genero = leia.nextInt();
				
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				leia.nextLine();

				if(genero == 1) {
					System.out.println("Digite se você é: 1 = Calmo | 2 = Agressivo");
					estado = leia.nextInt();
					leia.nextLine();
					
					if(estado == 1) {
						cont_pessoaCalma++;
						
						if(idade < 18)
							cont_calmo18++;
						
					} else if(estado == 2) {
						cont_homemAgressivo++;
						
						if(idade > 40)
							cont_nervoso40++;
					}
					cont_pessoa++;
				}
				if(genero == 2) {
					System.out.println("Digite se você é: 1 = Calma | 2 = Nervosa");
					estado = leia.nextInt();
					
					if(estado == 1) {
						cont_pessoaCalma++;
						if(idade < 18)
							cont_calmo18++;
					} else if (estado == 2) {
						cont_mulherNervosa++;
						if(idade > 40)
							cont_nervoso40++;
					}
					cont_pessoa++;
				}
				if(genero == 3) {
					System.out.println("Digite se você é uma pessoa: 1 = Calma | 2 = Nervosa");
					estado = leia.nextInt();
					if(estado == 1) {
						cont_pessoaCalma++;
						cont_outroCalmo++;
						if(idade < 18)
							cont_calmo18++;
					}
					if(estado == 2)
						if(idade>40)
							cont_nervoso40++;
					cont_pessoa++;
				}
				if(genero != 1 && genero !=2 && genero != 3)
					System.out.println("Entrada inválida");
			}while(cont_pessoa != 150);

			leia.close();
			
			System.out.println("Número de homens agressivos: " + cont_homemAgressivo +
					"Número de mulheres nervosas: " + cont_mulherNervosa +
					"Número de pessoas calmas: " + cont_pessoaCalma +
					"Número de outros calmos: " + cont_outroCalmo +
					"Número de pessoas nervosas com mais de 40 anos: " + cont_nervoso40 +
					"Número de pessoas calmas menor que 18 anos: " + cont_calmo18);
			}
}
		