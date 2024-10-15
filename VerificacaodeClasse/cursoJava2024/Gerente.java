package cursoJava2024;

public class Gerente extends Funcionario{
	public Gerente(String nome) {
		super(nome);
	}
	public String verificacaoCargo() {
		return getNome() + " é um Gerente ";
	}

}
