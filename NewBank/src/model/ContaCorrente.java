package model;

public class ContaCorrente extends Conta {
	private double desconto = 50;
	
	@Override
	boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.setSaldo(this.getSaldo() - desconto);
		return true;
	}
	
	void exibirDados() {
		System.out.println("Olá, você está na conta corrente");
		System.out.println("Nome: " + this.getNomeDono());
		System.out.println("Agencia : " + this.getAgencia());
		System.out.println("Numero da Conta :" + this.getNumero());
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	

	
}
