package cursoJava2024;
import java.util.Random;
public class GeradordeNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Random random = new Random();
 System.out.println(" Numeros aleatorios gerados:");
 for (int i = 0;i < 5; i++) {
	 System.out.println((random.nextInt(100) + 1)+" ");
 }
	}

}
