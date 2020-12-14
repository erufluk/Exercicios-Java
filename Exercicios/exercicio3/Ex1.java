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
			System.out.println("Salário do habitante " + (i+1) + ": R$" + salario + " ");
			System.out.println("Número de filhos habitante " + (i+1) + ": " + numFilhos + " ");
			
			salarioTotal += salario;
			mediaSalario = salarioTotal/totalHabitantes;
			
			totalFilhos += numFilhos;
			mediaNumFilhos = totalFilhos/totalHabitantes;
			
			//pega maior salario
			if(salario > maiorSalario) {
				maiorSalario = salario;
			}
			
			//pega percentual salario até R$100
			if(salario <= 100) {
				cont100 ++;
				percentualAte100 = (cont100 / totalHabitantes)*100;
			}
		}
		
		System.out.println("\nA média de salário da população é: R$" + mediaSalario);
		System.out.println("\nA média do numero de filhos é: " + mediaNumFilhos);
		System.out.println("\nO maior salário é: R$" + maiorSalario);
		System.out.println("\nO percentual de pessoas com salario até R$100,00 é: " + percentualAte100 + "%");
		
	}
}