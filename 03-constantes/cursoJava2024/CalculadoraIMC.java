package cursoJava2024;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIMC {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double peso = 0;
	        double altura = 0;

	        
	        while (true) {
	            try {
	                System.out.print("Digite o seu peso em kg: ");
	                peso = scanner.nextDouble();
	                if (peso <= 0) {
	                    System.out.println("O peso deve ser um valor positivo. Tente novamente.");
	                    continue;
	                }
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inválida. Por favor, insira um número válido para o peso.");
	                scanner.next(); // Limpa o buffer do scanner
	            }
	        }

	        
	        while (true) {
	            try {
	                System.out.print("Digite a sua altura em metros: ");
	                altura = scanner.nextDouble();
	                if (altura <= 0) {
	                    System.out.println("A altura deve ser um valor positivo. Tente novamente.");
	                    continue;
	                }
	                break;
	            } catch (InputMismatchException e) {
	                System.out.println("Entrada inválida. Por favor, insira um número válido para a altura.");
	                scanner.next(); // Limpa o buffer do scanner
	            }
	        }

	        double imc = calcularIMC(peso, altura);

	        System.out.printf("Seu IMC é: %.2f\n", imc);
	        exibirCategoria(imc);

	        scanner.close();
	    }

	    public static double calcularIMC(double peso, double altura) {
	        return peso / (altura * altura);
	    }

	    public static void exibirCategoria(double imc) {
	        if (imc < 18.5) {
	            System.out.println("Você está abaixo do peso.");
	        } else if (imc >= 18.5 && imc < 24.9) {
	            System.out.println("Você está com o peso normal.");
	        } else if (imc >= 25 && imc < 29.9) {
	            System.out.println("Você está com sobrepeso.");
	        } else {
	            System.out.println("Você está com obesidade.");
	        }
	    }
	}