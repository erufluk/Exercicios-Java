package exercicio2;


import java.util.*;
import java.math.*;

public class Ex4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double numero; 

		System.out.println("Insira um n�mero qualquer:");
		numero = ler.nextDouble();
		
	
		if (numero % 2 == 0 && numero >=0 ) {
			System.out.println("Esse n�mero � par e positivo ");
		} else if (numero % 2 == 0 && numero <0) {
			System.out.println("Esse n�mero � par e negativo " );
		}
		else if (numero % 2 != 0 && numero >=0) {
			System.out.println("Esse n�mero � impar e positivo " );
		}
		else if (numero % 2 != 0 && numero <0) {
			System.out.println("Esse n�mero � impar e negativo " );
		}
	}
 
}