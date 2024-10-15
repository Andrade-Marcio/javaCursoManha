package cursoJava2024;

public class Cap8_Lab1 {
	public static int maiorNumero(int[] numeros) {
		int maior = numeros[0]; // Inicializa com o primeiro número

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i]; // Atualiza o maior número
			}
		}
		return maior; // Retorna o maior número encontrado
	}

	public static void main(String[] args) {
		// Declaração e inicialização do array
		int[] numeros = { 3, 5, 7, 2, 8, 1 };

		// Chamada ao método e armazenamento do resultado
		int maior = Cap8_Lab1.maiorNumero(numeros);

		// Impressão do maior número na tela
		System.out.println("O maior número do array é: " + maior);
	}
}
