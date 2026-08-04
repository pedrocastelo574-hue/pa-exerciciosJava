package prjexercicio;

import java.util.Scanner;

public class escolherCaso {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
       int p;
       System.out.println("Escreva o ultimo numero de uma placa de veiculo");
       p = in.nextInt();
       
       switch(p){
        case 1:
        case 2:
        System.out.println("Seu carro não pode circular segunda");
        break;
        case 3:
        case 4:
        System.out.println("Seu carro não pode circular terça");
        break;
        case 5:
        case 6:
        System.out.println("Seu carro não pode circular quarta");
        break;
        case 7:
        case 8:
        System.out.println("Seu carro não pode circular quinta");
        break;
        case 9:
        case 0:
        System.out.println("Seu carro não pode circular sexta");
        break;
        default:
        	System.out.println("Número inválido");
       }
	}

}