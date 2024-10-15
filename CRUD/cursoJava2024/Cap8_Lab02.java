package cursoJava2024;

public class Cap8_Lab02 {
    public static void main(String[] args) {
        // Verifica se o array args possui elementos
        if (args.length > 0) {
            int soma = 0;

            // Laço para somar as idades
            for (int i = 0; i < args.length; i++) {
                soma += Integer.parseInt(args[i]);
            }

            // Calcula a média
            double media = (double) soma / args.length;

            // Exibe o resultado
            System.out.printf("A média das idades é: %.2f%n", media);
        } else {
            // Mensagem de erro
            System.out.println("Entre com valores válidos para as idades");
        }
    }
}


	
	   