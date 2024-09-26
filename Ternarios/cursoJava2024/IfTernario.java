package cursoJava2024;
import java.util.Scanner;
public class IfTernario {

	public static void main(String[] args) {
		//verivicando se o número é par ou impar usando if
		/*if ( numero% 2==0) {
			System.out.println(" O numero"+numero+"  é Par");
		}else {
			System.out.println(" O numero"+numero+" é impar");
		}*/
	Scanner tc = new Scanner(System.in);
	System.out.println("digite um numero");
	int numero = tc.nextInt();
	
	String resultado = (numero % 2==0)? " numero é par" : " o numero é impar";
	System.out.println(" O numero"+numero+" é "+resultado);
	
			
	}
}
