package exercicio2;

import java.util.*;
import java.math.*;

public class Ex3 {
	

		public static void main(String args[]) {
			Scanner ler = new Scanner(System.in);

			int num1, num2, num3, num4;

			System.out.println("Escreva o primeiro n�mero: ");
			num1 = ler.nextInt();

			System.out.println("Escreva o segundo n�mero: ");
			num2 = ler.nextInt();

			System.out.println("Escreva o terceiro n�mero: ");
			num3 = ler.nextInt();
			
			System.out.println("Escreva o quarto n�mero: ");
			num4 = ler.nextInt();
			
			if ((num3*num3)>=1000) {
				System.out.println("O valor do calculo � " + (num3*num3));
			}
			else if ((num3*num3)<1000){
				
	System.out.println("O primeiro valor digitado foi " + (num1)+ " E seu quadrado � " + (num1*num1)  + "O segundo valor digitado foi "+ (num2)+" E seu quadrado � " + (num2*num2)+ "O terceiro valor digitado foi "+ (num3)+" E seu quadrado � " + (num3*num3)+ "O quarto valor digitado foi "+ (num4)+" E seu quadrado � " + (num4*num4));
		
			}
			}}

