package cursoJava2024;
import java.util.Scanner;
public class IfTernario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Exercício:
			Crie um programa em Java que receba a idade de uma 
			pessoa e utilize o operador ternário para determinar 
			se a pessoa é maior de idade (18 anos ou mais). 
			O programa deve imprimir "Maior de idade" 
			se a idade for 18 ou mais, e "Menor de idade" 
			caso contrário.*/
	 
    Scanner teclado =  new Scanner(System.in);
    
    System.out.println(" digiete sua idade");
    int  idade = teclado.nextInt();
    
    
    String resultado =  (idade>18) ? " maioro de  idade" : " menor de idade";
    System.out.println(" Você é "+resultado);
	
	}
    
		
}

