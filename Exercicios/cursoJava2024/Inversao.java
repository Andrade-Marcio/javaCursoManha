package cursoJava2024;
import java.util.Scanner;
public class Inversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scanner = new Scanner(System.in);
   System.out.println("Digite uma palavra");
   String palavra = scanner.nextLine();
   String palavraInvertida = new StringBuilder(palavra).reverse().toString(); 
   System.out.println("Palavra invertida:" + palavraInvertida);
	}

}
