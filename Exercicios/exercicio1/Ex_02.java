package exercicio1;
import java.util.*;

public class Ex_02 {
	public static void main(String args[]) {
		int anos, meses, dias, idade;

		Scanner leia = new Scanner(System.in);
		System.out.println("Insira sua idade em dias: ");
		idade = leia.nextInt();

		anos = idade / 360;
		meses = (idade % 360) / 30;
		dias = (idade % 360) % 30;
		System.out.println("Você tem " + anos + " anos, " + meses + " meses " + dias + " dias de idade.");
	}

}



