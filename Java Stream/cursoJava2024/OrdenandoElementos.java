package cursoJava2024;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrdenandoElementos {

	
	public static void main(String[] args) {
		// Lista de nome:
		List<String> nome = Arrays.asList("Maria","Mario","Andre");
		List<String> OrdenandoElementos = nome.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(OrdenandoElementos);
		
		
		

	}

	
		
	}


