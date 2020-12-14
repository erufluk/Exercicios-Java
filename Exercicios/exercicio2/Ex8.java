package exercicio2;

import java.util.Scanner;

public class Ex8 {

	public static void main(String args[]) {

		Scanner ler = new Scanner(System.in);
		int N;

		System.out.println("Digite um numero ");
		N = ler.nextInt();

		if (N > 100) {
			System.out.println("O valor da variavel é " + N);
		}

		else if (N <=100) {
			System.out.println("O valor da variavel é 0");
		}}}