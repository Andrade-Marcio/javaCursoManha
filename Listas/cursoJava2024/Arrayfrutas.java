package cursoJava2024;

public class Arrayfrutas {
	private String nome;
	private String cor;
	private double peso;// em gramas

	// construtor da classe fruta:
	public Arrayfrutas(String nome, String cor, double peso) {
		this.nome = nome;
		this.cor = cor;
		this.peso = peso;
	}

	// Métodos para acessar os atributos:
	// Acessando o nome:
	public String getNome() {
		return nome;
	}

	// Acessando o cor:
	public String getCor() {
		return cor;
	}
	// Acessando pesso:
		public double getPeso() {
		return peso;
		}		
	// método para imprimir as informaçãoes das frutas:
	public void imprimirInfos() {
		System.out.println("Fruta:" +nome+ "Cor "+cor+ ",Peso: "+ peso+" g");
	}
	
	// Classe principal:
	
	 public static void main(String[] args) {
	        // Criação de um array de objetos da classe ArrayFrutas:
	       
		 Arrayfrutas[] arrayFrutas = {
	            new Arrayfrutas("Maçã", "Vermelha", 150.5),
	            new Arrayfrutas("Banana", "Amarela", 125.5),
	            new Arrayfrutas("Laranja", "Amarela", 180),
	            new Arrayfrutas("Uva", "Verde", 200.5),
	            new Arrayfrutas("Manga", "Verde", 2000.5)
	        };

	        // Exibindo informações de cada fruta:
	        System.out.println("Informações sobre frutas:");
	        for (Arrayfrutas fruta : arrayFrutas) {
	            fruta.imprimirInfos();
	        }
	    }
	}
