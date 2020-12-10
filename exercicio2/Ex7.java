package exercicio2;

import java.util.*;
import java.math.*;

public class Ex7 {
	public static void main(String[] args) {
		
	
	
	Scanner ler = new Scanner(System.in);
	
	int base, altura;

	
	System.out.println("Qual o valor da base? ");
		base = ler.nextInt();
	
		System.out.println("Qual o valor da altura? ");
		altura = ler.nextInt();

		if (base > 0 && altura > 0) {
		System.out.println("A Area do triangulo é");
		}
		else if (base <=0 || altura <= 0) {
		System.out.println("DIgite valores positivos e maiores que 0");
	}
	}
}
