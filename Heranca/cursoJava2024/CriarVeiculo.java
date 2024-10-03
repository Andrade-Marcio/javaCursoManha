package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Toyota", "Corola", 2000, 4);
		
		// Exibindo o carro:
		System.out.println("Detalhes do Carro 1");
		carro1.exibirDetalhes();

	}

}
