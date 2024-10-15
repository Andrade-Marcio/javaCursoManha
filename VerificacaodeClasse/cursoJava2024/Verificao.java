package cursoJava2024;

public class Verificao {

	public static void main(String[] args) {
	Funcionario funcionario = new Funcionario("Márcio");
	Gerente gerente = new Gerente(" Orlando");
	
	System.out.println(funcionario.getNome()+"não é o gerente");
	System.out.println(gerente.verificacaoCargo());

	}

}
