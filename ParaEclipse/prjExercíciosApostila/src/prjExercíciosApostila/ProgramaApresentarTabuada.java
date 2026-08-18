package prjExercíciosApostila;

import java.util.Scanner;

public class ProgramaApresentarTabuada {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1, n, r;
		
		System.out.println("Entre com um número e receba sua tabuada");
		n = in.nextInt();
		
		while(i<11) {
			r = n*i;
			System.out.println(n+"X"+i+"="+r);
			i++;
		}
		in.close();
	}

}
