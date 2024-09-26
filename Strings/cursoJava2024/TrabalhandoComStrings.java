package cursoJava2024;

public class TrabalhandoComStrings {

	public static void main(String[] args) {
    String texto = "Bem Vindo ao curso de JAVA";
    String texto2 = "vamos aprender sobre STRING.";
    
    //1.Comprimento da String:
    String nome = "Márcio da Silva Andrade";
    System.out.println("Comprimento da String:"+nome.length()); 
    
    //2.Concatenar Strings:
    String textoCompleto = texto + texto2;
    System.out.println("Texto completo: " + textoCompleto);
//    String nome2 = "Marcio";
//    String sobreNome = "Andrade";
//    System.out.println(nome2 + " " +sobreNome);
    
    //3. Converter para MAIÚSCULA E minúsculas:
    System.out.println(" MAIÚSCULAS: "+ texto.toUpperCase());
    System.out.println(" minúsculas: "+ texto.toLowerCase());
    
    
   // 4.Substituir uma parte da String:
    String novotexto = texto.replace("JAVA","Vitoria");
    System.out.println("texto após substituição: "+ novotexto);
    //5.Buscar por uma substring:
    int posicao = texto.indexOf("curso");
    System.out.println("Posição da palavra 'curso' :" + posicao);
    //6.verificar se uma string começa ou termina com 1 substring:
    System.out.println("Começa com 'bem'" + texto.startsWith("Bem"));
    System.out.println("Termina com 'bem'" + texto.endsWith("Bem"));
    
    //7.Dividir string
    String[] palavras = textoCompleto.split(" ");
    System.out.println("Palavra no texto completo:");
    for (String palavra : palavras) {
    	System.out.println(palavra);
    	
    	//8.Remover espaços em branco:
    	String textoComEspacos = "  Texto com espaços";
    	System.out.println("Texto sem espaços: '"+ textoComEspacos.trim() + " ' ");
    }
    
    
	}

}
