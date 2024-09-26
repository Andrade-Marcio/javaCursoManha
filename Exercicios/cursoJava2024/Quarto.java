package cursoJava2024;
import java.util.Scanner;

public class Quarto {

	public static void main(String[] args) {
		
	/*### Exercício 4: Verificar se um número é divisível por 3 e 5
	*Descrição*: Crie um programa que receba um número inteiro do usuário e use a função if para verificar 
	se o número é divisível tanto por 3 quanto por 5. Se for, exiba "O número é divisível por 3 e 5"; 
	caso contrário, exiba "O número não é divisível por 3 e 5".*/
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero");
		
		int valor = entrada.nextInt();
		
		if(valor % 3 == 0 || valor % 5 == 0) {
			System.out.println(" éste numero é divisor "+valor);
		}else {
			System.out.println(" o numero não é divisor"+valor);
		}
	
	
}
}