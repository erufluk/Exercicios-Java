package exercicio3;

import java.util.Scanner;



public class Ex6 {
	public static void main(String[] args) {
		
		int num=0, total=0, numBase=0;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		numBase = leia.nextInt();
		
		do {
			num++;
			total+=num;
			if(num==numBase) {
				System.out.print(num + " = ");
			}else {
				System.out.print(num + " + ");
			}

		}while(num < numBase);
		System.out.println(total);
		
		leia.close();
	}
}