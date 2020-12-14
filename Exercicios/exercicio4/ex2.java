package exercicio4;

import java.util.Scanner;

public class ex2 {
public static void main(String[] args) {
	
	Scanner leia = new Scanner (System.in);
	final int VEZES=10;
	double media = 0;
	double total = 0;
	int lancamento[]= new int [VEZES];
	
	for (int x=0; x<10; x++)
	{
		System.out.println("DIgite um valor de 1-6: ");
		lancamento[x]=leia.nextInt();
		total = lancamento[x]+total;
	}
	
	media = (total/VEZES);
	
	System.out.println("Média "+ media);
}
	
}
