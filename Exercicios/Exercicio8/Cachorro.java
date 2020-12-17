package Exercicio8;

public class Cachorro extends Animal{
	
	private String correr;

	public Cachorro ()
	{	
		
	}
	
	public String getNome() {
		return "Cachorro: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nAção: " + this.getCorrer();
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}