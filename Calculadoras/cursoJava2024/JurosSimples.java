package cursoJava2024;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class JurosSimples {

	public static void main(String[] args) {
		// Instsnciando a classe (uasando a classe):
		Scanner scanner =  new Scanner(System.in);
    // entrada de valor :
		System.out.println("------------------");
		System.out.println("--Calculadora de Juros simples--");
		System.out.println("------------------");
		System.out.println("digite o capital:");
		double capital =  scanner.nextDouble();
		
		System.out.println("Informe a taxa de Juros(%):");
		double taxa = scanner.nextDouble();
		
		System.out.println(" informe o tempo( em anos):");
		double tempo = scanner.nextDouble();
		
		//Calculando os juros:
		double juros = ( capital * taxa * tempo)/100;
		System.out.println(" O valor dos juros são:"+juros);
		// resultado:
		double total = capital + juros;
			System.out.println(" O total investido + juros é de:"+total);
		scanner.close();
		
		
		
	}

}
