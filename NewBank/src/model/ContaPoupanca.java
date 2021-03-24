package model;

public class ContaPoupanca extends Conta {
	private double bonus = 50;
	
	@Override
	boolean sacar(double valor) {
		this.setSaldo(this.getSaldo() - valor);
		this.setSaldo(this.getSaldo() + bonus);
		return true;
	}
	
	void exibirDados() {
		System.out.println("Voce est� em conta Poupan�a");
		System.out.println("nome" + this.getNomeDono());
		System.out.println("Agencia" + this.getAgencia());
		System.out.println("Numero da conta" + this.getNumero());
	
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	

}
