package cursoJava2024;
import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		//Conhecendo o condicional IF:
		System.out.println("o valor da entrada da vareavel é");
		int idade = entrada.nextInt();
		//Verificando o valor:
		if( idade> 20) {
			System.out.println(" Ovalor é maior que 20 !");
		} else if( idade<20){
			System.out.println( " Valor menor que 20 !");
		} else {
			System.out.println( " é igual a 20 !");
		}
	}

}
 