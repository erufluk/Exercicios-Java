package exercicio1;

import java.util.*;

public class Ex_04 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		int a, b, c;
		float d, r, s;

		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();

		r = (a + b) * (a + b);
		s = (b + c) * (b + c);
		d = (r + s) / 2;

		System.out.println("O valor de D é: " + d);
	}
}
