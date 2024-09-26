package cursoJava2024;
import java . util. Scanner;
public class Taxataxi {

	public static void main(String[] args) {
		
		 /*Crie um programa em Java que calcula o valor a ser pago por um táxi
		com base nos quilômetros rodados: R$2 por km rodado + R$ 10 de taxa fixa.*/
		 // Taxas
		final double Pre_Por_KM =2.0;
		final double taxa_Fixa = 10.0;	
		
		// Solicitar a distancia percorrida
		
		
		
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Digite o quilômetro rodado");
      double distancia = sc.nextDouble();
      
         // Calcular o valor total:
      double valorTotal = (Pre_Por_KM * distancia) + taxa_Fixa;
      
      // Exibir o resultado:
      System.out.printf("O valor a ser pago pelo táxi é: R$ %.2f%n", valorTotal);
     // Fechar o scanner
      sc.close();
      

      
	}
	

}
