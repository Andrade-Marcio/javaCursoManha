package cursoJava2024;

public class Carro1 implements Veiculo1 {
	// Construtor sem parametros(neccess[ario paara alinha 'new Carro')
	public Carro1() {

}
	@Override
	public  void acelerar() {
		System.out.println(" O carro está acelerando...");
	}
	@Override
	public  void frear() {
		System.out.println(" O carro está freando...");
	
	}
}
