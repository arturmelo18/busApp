package br.onibus.com;

import java.util.Scanner;

public class onibus {

	public static void main(String[] args) {
		Scanner passageiro = new Scanner(System.in);
		String[] lugares = new String[10];
		int i = 0;
		do {
			System.out.println("Por favor, fale seu nome");
			String nome = passageiro.next();
			System.out.println("============================================");
			System.out.println("=====1) Reservar vaga ======================");
			System.out.println("=====2) Cancelar reserva ===================");
			System.out.println("=====3) Exibir todas as vagas reservadas====");
			System.out.println("=====0) Sair ===============================");
			System.out.println("============================================");
			System.out.println("Digite a opção desejada");
			int opcao = passageiro.nextInt();
			switch (opcao) {
			case 1:
				System.out.println("Assento 1 :" + lugares[0]);
				System.out.println("Assento 2 :" + lugares[1]);
				System.out.println("Assento 3 :" + lugares[2]);
				System.out.println("Assento 4 :" + lugares[3]);
				System.out.println("Assento 5 :" + lugares[4]);
				System.out.println("Assento 6 :" + lugares[5]);
				System.out.println("Assento 7 :" + lugares[6]);
				System.out.println("Assento 8 :" + lugares[7]);
				System.out.println("Assento 9 :" + lugares[8]);
				System.out.println("Assento 10 :" + lugares[9]);

				System.out.println("Escolha um assento de 1 a 10 (que esteja vazio)");
				int resposta = passageiro.nextInt();
				if (lugares[resposta-1] != null) {
					System.out.println("Escolha outro assento!");
					break;
				}
				else {
				switch (resposta) {
				case 1:
					lugares[0] = "Assento 1 ocupado por ";
					break;
				case 2:
					lugares[1] = "Assento 2 ocupado por " ;
					break;
				case 3:
					lugares[2] = "Assento 3 ocupado por ";
					break;
				case 4:
					lugares[3] = "Assento 4 ocupado por ";
					break;
				case 5:
					lugares[4] = "Assento 5 ocupado por ";
					break;
				case 6:
					lugares[5] = "Assento 6 ocupado por ";
					break;
				case 7:
					lugares[6] = "Assento 7 ocupado por ";
					break;
				case 8:
					lugares[7] = "Assento 8 ocupado por ";
					break;
				case 9:
					lugares[8] = "Assento 9 ocupado por ";
					break;
				case 10:
					lugares[9] = "Assento 10 ocupado por ";
					break;
				}
			}	
				break;
			case 2:
				System.out.println("Qual reserva você quer cancelar?");
				int cancelar = passageiro.nextInt();
				switch (cancelar) {
				case 1:
					lugares[0] = null;
					break;
				case 2:
					lugares[1] = null;
					break;
				case 3:
					lugares[2] = null;
					break;
				case 4:
					lugares[3] = null;
					break;
				case 5:
					lugares[4] = null;
					break;
				case 6:
					lugares[5] = null;
					break;
				case 7:
					lugares[6] = null;
					break;
				case 8:
					lugares[7] = null;
					break;
				case 9:
					lugares[8] = null;
					break;
				case 10:
					lugares[9] = null;
					break;
				}
				break;
			case 3:
				if (lugares[0] != null) {
					System.out.println("Assento 1 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[1] != null) {
					System.out.println("Assento 2 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[2] != null) {
					System.out.println("Assento 3 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[3] != null) {
					System.out.println("Assento 4 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[4] != null) {
					System.out.println("Assento 5 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[5] != null) {
					System.out.println("Assento 6 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[6] != null) {
					System.out.println("Assento 7 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[7] != null) {
					System.out.println("Assento 8 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[8] != null) {
					System.out.println("Assento 9 está ocupado");
				} else {
					System.out.println();
				}
				if (lugares[9] != null) {
					System.out.println("Assento 10 está ocupado");
				} else {
					System.out.println();
				}
				break;
			case 0:
				return;
			default:
				if (opcao != 0) {
					System.out.println("Digite uma opção válida");
				}
			}
		} while (i == 0);
		
	}

}
