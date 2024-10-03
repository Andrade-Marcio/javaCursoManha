package cursoJava2024;

public class Main {

	public static void main(String[] args) {
		// Criação de uma conta com saldo inicial de R$ 1000,00
		ContaBancaria conta = new ContaBancaria(1000);
		// exibir o saldo inicial:
		System.out.println("Saldo inicial:" + conta.getSaldo());
//realizando um deposito de R$ 500,00:
		conta.sacar(250);
		System.out.println("Saldo :R$" + conta.getSaldo());
		conta.depositar(100000);
		System.out.println("depositar :R$" + conta.getDepositar());
		
	}

}
