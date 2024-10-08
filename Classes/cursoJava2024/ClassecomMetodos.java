package cursoJava2024;

import java.util.Scanner;

public class ClassecomMetodos {
	// Método 01: calcula a soma de 2 numeros
	public int soma(int a, int b) {
		return a + b;
	}

	/*
	 * // declare uma variavel
	 * 
	 * int numero;
	 * 
	 * //inicializa o Scanner para leitura de dados
	 * 
	 * Scanner scanner = new Scanner(System.in); // solicita ao usuário para
	 * informar um numero System.out.println("Digite o numero");
	 * 
	 * numero = scanner.nextInt(); // 3. Lógica para contar o número de divisores
	 * 
	 * int contagemDivisores = 0;
	 * 
	 * for(int i = 1;i<=numero; i++) {
	 * 
	 * if (numero % i == 0) { contagemDivisores++; //incrementa a contagem de
	 * divisores // verifica se o numero é primo System.out.println(numero +
	 * "não é um numero primo."); }else { System.out.println(numero +
	 * " é um número primo");
	 * 
	 * // fecha o sacnner scanner.close();
	 */

	// metodo 02: verificando se 1 numero é par :
	public boolean ehPar(int numero) {
		return numero % 2 == 0;
	}

	// Método 03:inverter String:
	public String inverteString(String texto) {
		return new StringBuilder(texto).reverse().toString();
	}
	
	//Método 04:calcula o fatorial de um numero:
	public int fatorial(int numero) {
		if ( numero == 0 || numero == 1) {return 1;
		
		}
		return numero * fatorial(numero - 1);
	}

	public static void main(String[] args) {
		// Instanciando a classe:
		ClassecomMetodos utilidades = new ClassecomMetodos();
		// Chamando os metodos
		System.out.println("A soma de 5 e 3 é:" + utilidades.soma(5, 3));
		System.out.println(utilidades.ehPar(2));
		System.out.println("String invertida:" + utilidades.inverteString("Marcio"));
		
		System.out.println("Fatorial de % é:"+ utilidades.fatorial(5));
	}
}
