package Exercicio5;

import java.util.Random;

public class ex6 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int vetor[] = new int[3];
		int matriz[][] = new int [3][3];
		int newMatriz[][] = new int [3][3];
		
		
		System.out.println("Vetor: ");
		for(int i=0; i<3; i++) {
			vetor[i] = random.nextInt(5);
			System.out.print(vetor[i] + " ");
		}
		
		System.out.println("\nMatriz:");
		for(int l=0; l<3; l++) {
			System.out.println();
			for(int c=0; c<3; c++) {
				matriz[l][c] = random.nextInt(5);
				System.out.print(matriz[l][c] + " ");
			}
		}
		
		System.out.print("\nNova matriz:");
		for(int l=0; l<3; l++) {
			System.out.println();
			for(int c=0; c<3; c++) {
				newMatriz[l][c] = vetor[l] * matriz[l][c];
				System.out.print(newMatriz[l][c] + " ");
			}
		}
		
	}
}
