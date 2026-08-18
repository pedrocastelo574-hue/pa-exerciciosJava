package prjExercíciosApostila;

import java.util.Scanner;

public class ProgramaMaiorMenorSixVezes {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, an, aa, idd;
		while(i<7) {
			System.out.println("Entre com o ano de nascimento");
			an = in.nextInt();
			System.out.println("Entre com o ano atual");
			aa = in.nextInt();
			idd=an-aa;
			if(idd<18) {
				System.out.println("Menó");
			}
			else {
				System.out.println("Marmanjo");
			}
			i++;			
		}
		in.close();
	}

}
