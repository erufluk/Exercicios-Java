package exercicio3;

import java.util.Scanner;

public class Ex4{
	public static void main(String[] args) {
		double num =0.0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		num = leia.nextDouble();
		
		System.out.print(num + " | ");
		while(num <= 100) {
			num*=3;
			if(num > 100) {
				System.out.print(num );
			} else {
				System.out.print(num + " | ");
			}
			
		}
		leia.close();
	}
}