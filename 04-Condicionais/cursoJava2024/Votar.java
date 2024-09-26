package cursoJava2024;
import java.util.Scanner;
public class Votar {
public static void main(String[] args) {
	
	
	System.out.println("qual é sua idade: ");
	
	
	Scanner entrada = new Scanner(System.in);
	int idade = entrada.nextInt();
	
	
	if( idade< 16 ) {
		System.out.println( " é proibido votar");
	}else if( idade == 16 || idade < 18) {
		System.out.println( " vota se quiser");
	}else if ( idade >=18) {
		System.out.println( " obrigatorio votar");
	}
	
}
}
