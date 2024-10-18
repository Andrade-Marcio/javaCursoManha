package cursoJava2024;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OlaMundoGUI extends JFrame {
	public OlaMundoGUI() {
		// Configurando a tela/janela:
		setTitle("Ola Mundo em JAVA");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// centraliza a janela

		// Cria o botão:
		JButton botao = new JButton("Clique em mim!");

		// Adicionar um evento escutador:
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Exibe um popup com a mensagem "Ola mundo"
				JOptionPane.showMessageDialog(null, "Ola mundo");
			}

		});
		// Adicionar botao
		add(botao);
		// Tornar a janela invisível:
		setVisible(true);
	}

	public static void main(String[] args) {
		// Chamar e executar a GUI :
		new OlaMundoGUI();
	}
}
