package cursoJava2024;

import java.util.Scanner;

public class CalculoImc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Digite seu peso em Kg");

		double peso = scanner.nextDouble();
		double altura = scanner.nextDouble();
		double imc = peso / (altura * altura);

		
		System.out.printf("Seu Imc é:%.2f%n", imc);

		if (imc < 18.5) {
			System.out.println("Classifique peso: Baixo");
		} else if (imc < 24.9) {
			System.out.println("Clasifique: peso Normal");
		} else if (imc < 29.0) {
			System.out.println("Classifique: peso Sobrepeso");
		} else {
			System.out.println("Classifique: pesso Obesidade");
		}
	}
}
