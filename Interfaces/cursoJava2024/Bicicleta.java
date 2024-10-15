package cursoJava2024;

public class Bicicleta implements Veiculo1 {
	public Bicicleta() {
		
	}
	@Override
	public  void acelerar() {
		System.out.println(" A Bicicleta está acelerando...");
	}
	@Override
	public  void frear() {
		System.out.println(" A Bicleta está freando...");
	
	}
}
