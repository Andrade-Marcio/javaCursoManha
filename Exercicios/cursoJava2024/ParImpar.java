package cursoJava2024;
import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner( System.in);
		System.out.println(" Digite um numero:");
		int valor = scanner.nextInt();

	
	if( valor % 2== 0) {
		System.out.println( " O numero é par !");
	}else {
		
			System.out.println(" O numero é impar !");
		}
	}

}


