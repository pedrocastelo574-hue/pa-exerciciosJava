package prjexercicio;

import java.util.Scanner;

public class diaMes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int mes;
		System.out.println("Escreva um número correspondente a um mês do ano (1 a 12");
		mes = in.nextInt();
		
		switch(mes) {
			case 2:
				System.out.println("28 dias");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("31 dias");
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("30 dias");
				break;
			default:
				System.out.println("Número inválido");
		}
	}

}
