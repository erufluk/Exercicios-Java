package exercicio3;

import java.util.Random;

public class Ex1 {
	public static void main(String[] args) {
		double salario =0.0, mediaSalario=0.0, salarioTotal=0.0, mediaNumFilhos=0.0;
		double maiorSalario=0.0, percentualAte100=0.0;
		int numFilhos =0, totalFilhos=0, totalHabitantes=0, cont100=0;
		
		Random sortear = new Random();
		
		for(int i=0; i<3; i++) {
			totalHabitantes++;
			
			salario = sortear.nextInt(500);
			numFilhos = sortear.nextInt(5);
			System.out.println("Sal�rio do habitante " + (i+1) + ": R$" + salario + " ");
			System.out.println("N�mero de filhos habitante " + (i+1) + ": " + numFilhos + " ");
			
			salarioTotal += salario;
			mediaSalario = salarioTotal/totalHabitantes;
			
			totalFilhos += numFilhos;
			mediaNumFilhos = totalFilhos/totalHabitantes;
			
			//pega maior salario
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			//pega percentual salario at� R$100
			if(salario <= 100) {
				cont100 ++;
				percentualAte100 = (cont100 / totalHabitantes)*100;
			}
		}
		
		System.out.println("\nA m�dia de sal�rio da popula��o �: R$" + mediaSalario);
		System.out.println("\nA m�dia do numero de filhos �: " + mediaNumFilhos);
		System.out.println("\nO maior sal�rio �: R$" + maiorSalario);
		System.out.println("\nO percentual de pessoas com salario at� R$100,00 �: " + percentualAte100 + "%");
		
	}
}