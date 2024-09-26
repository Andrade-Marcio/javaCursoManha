package cursoJava2024;
import java . util .Scanner;
public class Contagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite uma frase");
		
		String frase = scanner.nextLine();
		int contagem = 0;
		
		for(char letra : frase.toLowerCase().toCharArray()){
			if("aeiou".indexOf(letra) != -1){
				contagem++;
			}
		}
		System.out.println("Numero de vogais na frase:"+contagem);
		
	}

}
