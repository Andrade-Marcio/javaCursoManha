package cursoJava2024;
import java .util.Scanner;
public class JurosComposto {

	public static void main(String[] args) {
		
        // Instanciando uma classe para usá-la:
		Scanner sc = new Scanner(System.in);
		
		// Entradas do usuário:
		//pegando o capital iniial:
		System.out.println("Digite o capital: ");
		double capital = sc.nextDouble();
		
		// pegando a taxa de juros:
		System.out.println("Qual é a taxa de juros: ");
		double taxa = sc.nextDouble();
		
		// Pegando o tempo :
		System.out.println("Digite o tempo em anos:");
		int tempo = sc.nextInt();
		
		// Caulculando os Juros composto:
	    double montante = capital * Math.pow(1 + (taxa/100), tempo);
	    
	    //saida final
	    System.out.println("O montante final será de R$" +montante);
	 
	    sc.close();
	}

}
