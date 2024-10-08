package cursoJava2024;

public class ArraySimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cjriando um Array de (lista de compras):
		String[] mercado = {"Arroz", "Açúcar","Danone","Café", "Leite"};
		
		//Exibindo apenas o terceiro item da lista:
		System.out.println("Item Selecionada:"+ mercado[0]);//Danone!
		//Todo array começa Zero!
		
		//Exibindo todos os itens do Array:
		/* lendo a linha "item< mercado.length":Enquanto item for menor 
		do que o comprimento de itens do array,faça algo!*/
		for (int item = 0; item < mercado.length; item++) {
			System.out.println(mercado[item]);
		}

	}

}
