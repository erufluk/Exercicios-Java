package exercicio3;

public class Ex2{
	public static void main(String[] args) {
		int i=1;
		for(i=1; i<500; i++) {
			if(i%2!=0 && i%3==0) {
				
				i+=i;
				
			}
		}
		System.out.println("A soma dos n�meros �mpares multiplos de 3 �: " + i);
	}
}

