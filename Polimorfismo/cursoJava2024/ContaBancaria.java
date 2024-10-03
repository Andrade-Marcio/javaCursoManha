package cursoJava2024;

public class ContaBancaria {

	// Atributo privado
	private double saldo;

	// Construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;

	}

	// Metodo publico para sacar sua GRANA:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realisado");

		} else {
			System.out.println("Saque invalido. Saldo insuficiente ou valor negativo!");
		}
	}

	// Método publico para consultar o saldo(getter)
	public double getSaldo() {
		return saldo;

	}

	// Método público para depositar
	public void depositar(double valor) {

		saldo += valor;
		if (valor > 0) {

			System.out.println("deposito de " + valor + " realizado!");

		} else {
			System.out.println("Saque invalido.Saldo insuficiente ou valor negativo!");
		}
	}

	public double getDepositar() {
		return saldo;
	}

}
