package exercicio2;

 import java.util.Scanner;

public class Ex6 {
	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int idade;

		System.out.println("Qual a sua idade? ");
		idade = ler.nextInt();

		if (idade >= 5 && idade <= 7) {
			System.out.println("Você pertence ao grupo infantil A");
		}

		else if (idade >= 12 && idade <= 13) {
			System.out.println("Você pertence ao grupo Juvenil A");
		}

		else if (idade >= 14 && idade <= 18) {
			System.out.println("Você pertence ao grupo Juvenil B");
		}

		else {
			System.out.println("Você pertence ao grupo de adultos");

		}
	}}
