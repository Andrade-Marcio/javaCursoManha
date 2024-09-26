package cursoJava2024;
import java.util.Scanner;
public class IfTernario4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	


	

	   
	        Scanner scanner = new Scanner(System.in);

	        // Solicita os dois números
	        
	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        // Uso do operador ternário para determinar o maior número
	        int maiorNumero = (numero1 > numero2) ? numero1 : numero2;

	        // Imprime o maior número
	        System.out.println("O maior número é: " + maiorNumero);

	        scanner.close();
	    }
	}

	
