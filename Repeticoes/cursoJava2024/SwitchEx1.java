package cursoJava2024;

import java.util.Scanner;

public class SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Descrição do Exercício:
			O programa terá uma variável hora, que representa a hora do dia (de 0 a 23).
			Com base no valor da hora, o programa usará switch para exibir diferentes saudações:
			Bom dia: das 6h às 11h
			Boa tarde: das 12h às 17h
			Boa noite: das 18h às 23h
			Madrugada: das 0h às 5h */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a hora(0-23)");
		
		int hora = scanner.nextInt();
		
		
		if (hora >= 6 && hora <= 11) {
			hora = 1;
		}else if( hora >= 12 && hora <= 17) {
			hora = 2;
		}else if( hora >= 18 && hora <= 23) {
		hora = 3;
		}else if( hora >= 0 && hora <= 5) {
		hora = 4;
	}else {
		System.out.println(" opição invalida");
		System.out.println("Digite a hora(0-23)");
		
		hora = scanner.nextInt();
	}
		
		
		switch (hora) {
		case 1:
			System.out.println("Bom dia: das 6h às 11h");
			break;
		case 2:
			System.out.println("Boa tarde: das 12h às 17h");
			break;
		case 3:
			System.out.println("Boa noite: das 18h às 23h");
			break;
		case 4:
			System.out.println("Boa Madrugada: das 0h às 5h */");
			break;
			default:
				System.out.println("error");
				
				
	}

}
}