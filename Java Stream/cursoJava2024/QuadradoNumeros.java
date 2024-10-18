package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.stream.Collectors;

public class QuadradoNumeros {
	public static void main(String[] args) {
		List<Integer> numeros = List.of(1, 2, 3, 4, 5); // Exemplo de lista de números
		List<Integer> quadrados = calcularQuadrados(numeros);

		System.out.println("Quadrados: " + quadrados);
	}

	public static List<Integer> calcularQuadrados(List<Integer> numeros) {
		List<Integer> quadrados = new ArrayList<>();
		for (Integer numero : numeros) {
			quadrados.add(numero * numero); // Calcula o quadrado e adiciona à lista
		}
		return quadrados;
	}

}
