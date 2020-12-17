package Exercicio7;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, String cpf, int telefone, int idade) {
		super(nome, endereco, idade, telefone, cpf);
	}

	public void imprimirInfo() {
		System.out.println("\nNome do vendedor(a): " + getNome() + "\nCPF: " + getCpf() + "\nIdade: " + getIdade()
				+ "\nTelefone: " + getTelefone() + "\nEndere�o: " + getEndereco() + "\nValor Vendas: "
				+ getValorVendas() + "\nComiss�o: " + getComissao() + "%");
	}

	public void salarioTotal() {
		double salarioTotal = valorVendas + (valorVendas * comissao / 100);
		System.out.println("O sal�rio total � = " + salarioTotal);
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
