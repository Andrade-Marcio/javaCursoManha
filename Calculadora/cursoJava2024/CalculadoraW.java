package cursoJava2024;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraW extends JFrame implements ActionListener {

	private JTextField display;
	private StringBuilder currentInput;
	private double num1 = 0, num2 = 0;
	private String operator = "";

	public CalculadoraW() {
		// Montando a tela da calculadora
		setSize(300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(new BorderLayout());

		// montando campo de texto para mostrar resultado:
		display = new JTextField();
		display.setFont(new Font("Arial", Font.BOLD, 24));
		display.setEditable(false);
		add(display, BorderLayout.NORTH);

		// MONTANDO O PAINEL COM OS BOTÕES
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

		// Criando os botõe:
		String[] buttons = { 
				
				"7", "8", "9", "/", 
				"4", "5", "6", "*", 
				"1", "2", "3", "+",
				"0", ".", "=", "-",
				"C"

		};

		for (String text : buttons) {
			JButton button = new JButton(text);
			button.setFont(new Font("Arial", Font.BOLD, 18));
			button.addActionListener(this);
			buttonPanel.add(button);
		}

		add(buttonPanel, BorderLayout.CENTER);

		// Inicializar o input atual:
		currentInput = new StringBuilder();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();

		// Lógica para limpar a tela(display):
		if (command.equals("C")) {
			resetCalculator();
			return;
		}

		// Lógica para os operadores:
		if ("/+-*".contains(command)) {
			if (currentInput.length() > 0) {
				try {
					
					num1 = Double.parseDouble(currentInput.toString());
					operator = command;
					currentInput.setLength(0);// limpa pro prox numero;
				} catch (NumberFormatException ex) {
					display.setText("Erro: Entrada invalida!");
					currentInput.setLength(0);
				}
			}
			return;
		}

		// Lógica para o "=" (resultado):
		if (command.equals("=")) {
			if (currentInput.length() > 0) {
				try {
					num2 = Double.parseDouble(currentInput.toString());
					double result = calcula(num1, num2, operator);
					display.setText(String.valueOf(result));
				} catch (ArithmeticException ex) {
					display.setText("Erro: Entrada Invalida!");
				
				}
				currentInput.setLength(0);// Limpando para nova operação!
			}
			return;
		}

	

	// Adiciona digitos ao input atual:
	currentInput.append(command);
	display.setText(currentInput.toString());
}

	// Método para realizar a operação matemática;
	private double calcula(double num1, double num2, String operator) throws ArithmeticException{
		switch ( operator ) {
		case "+":
			return num1 + num2;
		case "-":
			return num1 - num2;
		case "*":
			return num1 * num2;
		case"/":
			if( num2 == 0) {
				throw new ArithmeticException("Divisão por Zero");
			}
		
		return num1 / num2;
		default:
			return 0;
	}
	}



// Método para resetar a calculadora:
	private void resetCalculator() {
		currentInput.setLength(0);
		display.setText("");
		num1 = num2 = 0;
		operator = "";
	}

//Metodo principal para EXECUTAR a calculadora:
public static void main(String[] args) {
	SwingUtilities.invokeLater(() -> {
		CalculadoraW calc = new CalculadoraW();
		calc.setVisible(true);
	});
}
}
