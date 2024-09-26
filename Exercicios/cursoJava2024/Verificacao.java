package cursoJava2024;

import java.util.Scanner;

public class Verificacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner scanner = new Scanner(System.in);
 System.out.println("Digite uma palavra");
 
 String palavra = scanner.nextLine();
 String palavraInvertida = new StringBuilder(palavra).reverse().toString();
 
 
 if (palavra.equalsIgnoreCase(palavraInvertida)) {
	 System.out.println("\""+ palavra + "\" é um polindromo.");
	}else{
		
		System.out.println("\"" + palavra + "\" não é um polindromo");
	}

}
}

