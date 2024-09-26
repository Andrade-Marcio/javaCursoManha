package cursoJava2024;
import java.util.Scanner;
public class SomaDosDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   System.out.println("Digite um número inteiro");
   
   String numero = scanner.nextLine();
   int soma =0;
   
   for (char digito : numero.toCharArray()) {
	   soma += Character.getNumericValue(digito);
   }
   System.out.println("Soma dos digitos" + soma);
	}

}
