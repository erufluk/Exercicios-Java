package exercicio2;


import java.util.*;
import java.math.*;

public class Ex4 {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		double numero; 

		System.out.println("Insira um número qualquer:");
		numero = ler.nextDouble();
		
	
		if (numero % 2 == 0 && numero >=0 ) {
			System.out.println("Esse número é par e positivo ");
		} else if (numero % 2 == 0 && numero <0) {
			System.out.println("Esse número é par e negativo " );
		}
		else if (numero % 2 != 0 && numero >=0) {
			System.out.println("Esse número é impar e positivo " );
		}
		else if (numero % 2 != 0 && numero <0) {
			System.out.println("Esse número é impar e negativo " );
		}
	}
 
}