package exercicio1;

import java.util.*;

public class Ex_03 {

	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);

		float horas, minutos, segundos, total;

		System.out.println("Qual a dura��o total do evento em segundos? ");
		total = leia.nextInt();

		horas = total / 3600;
		minutos = (total % 3600) / 60;
		segundos = (total % 3600) % 60;

		System.out.println("A dura��o total do evento foi de " + horas + " horas, " + minutos + " minutos e " + segundos
				+ " segundos");
	}}
