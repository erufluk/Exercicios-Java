package exercicio1;

import java.util.*;

public class Ex_01 {
	public static void main(String args[]) {
		int anos, meses, dias, idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Qual a sua idade em anos? ");
		anos = leia.nextInt();

		System.out.println("E quantos meses? ");
		meses = leia.nextInt();

		System.out.println("E quantos dias? ");
		dias = leia.nextInt();

		idade = (anos * 365) + (meses * 30) + dias;

		System.out.println("Voc� j� viveu " + idade+" Dias");
	}
}
