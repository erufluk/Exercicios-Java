package Exercicio8;

public class Cavalo extends Animal{
	private String correr;

	public Cavalo ()
	{	
		
	}
	
	public String getNome() {
		return "Cavalo: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nA��o: " + this.getCorrer();
	}
	//getters and setters 
	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
}