package Exercicio8;

public class Preguica extends Animal {

	
		private String subirArvores;

		public Preguica ()
		{	
			
		}
		
		public String getNome() {
			return "Pregui�a: " + super.getNome() + "\nIdade: " + super.getIdade() + "\nSom: " + super.getSom() + "\nA��o: " + subirArvores;
		}
		//getters and setters 
		public String getCorrer() {
			return subirArvores;
		}

		public void setCorrer(String correr) {
			this.subirArvores=subirArvores;
		}
	}

