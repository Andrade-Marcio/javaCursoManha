package cursoJava2024;
import java.util.Scanner;
public class Terceiro {

	public static void main(String[] args) {
		/* Exercício 3: Verificar se uma pessoa é maior de idade
		 *Descrição*: Escreva um programa que receba a idade de uma pessoa e 
		 use a estrutura if para verificar se ela é maior de idade (18 anos ou mais). 
		 Se for maior de idade, exiba a mensagem "Você é maior de idade"; caso contrário, 
		 exiba "Você é menor de idade".*/

	Scanner entrada = new Scanner(System.in);
	System.out.println(" Qual é sua idade");
	
	int idade = entrada.nextInt();
	
	if(idade >= 18) {
		System.out.println("Voçê é maior de idade "+idade+ " anos");
	}else {
		System.out.println("Voçê é menor de idade "+idade+ " anos");
	}
		
	}

}
