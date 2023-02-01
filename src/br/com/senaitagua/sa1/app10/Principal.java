package br.com.senaitagua.sa1.app10;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int mes = 12;
		int opcao = 5;
		
		switch(opcao) {
		case 1:
			if (mes == 1) {
				System.out.println("Janeiro");
			}
		break;
			
		case 2: 
			if (mes == 1) {
				System.out.println("Janeiro");
			} else {
				System.out.println("Outro mês");
			}
		break;
		
		case 3:
			if (mes == 1) {
				System.out.println("Janeiro");
			} else if (mes == 2) {
				System.out.println("Fevereiro");
			} else 
				System.out.println("Outro mês");
		break;
		case 4:
			if (mes == 12) {
				for (int i=1; i<=12;i++) {
					System.out.println("Feliz Natal >mes:" +i);
				} 
			} else {
				System.out.println("Não é natal");
			}
		break;
		case 5:
			if (mes == 12) {
				System.out.println("Seja bem-vindo ao Banco SS");
				int senha = 123;
				int cont = 1;
				
				while (cont <= 3) {
					System.out.println("Insira sua senha: ");
					senha = leia.nextInt();
					cont = cont + 1;
					
					if (senha == 123) {
						System.out.println("Pode sacar.");
					break;	
					} else {
						if (cont == 4 && senha != 123) {
							System.out.println("Conta bloqueada");			
						}
					}	
				}	
			}
		break;
		
		default:
			System.out.println("Opção inexistente");
	}
		
	}

}
