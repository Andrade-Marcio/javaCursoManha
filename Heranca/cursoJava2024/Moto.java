package cursoJava2024;

public class Moto {

	public class Moto extends veiculo{
		private boolean temBagageiro;
		
		public Moto(string marca, String modelo, int ano, boolean temBagageiro) {
			super(marca, modelo, ano);
			this.temBagageiro = temBagageiro;
		}
		@Override
		public void exibirDetalhes() {
			system.out.println("Tem bagageiro: " + (temBagageiro ? "Sim" : "Não"));
		}
		

	}

}
