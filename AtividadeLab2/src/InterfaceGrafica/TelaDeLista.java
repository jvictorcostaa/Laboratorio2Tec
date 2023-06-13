package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TelaDeLista extends JPanel {
	public TelaDeLista() {
		makeTelaDeLista();
	}
	public void makeTelaDeLista() {
		this.setLayout(new BorderLayout());
		JLabel lista = new JLabel("LISTA DE ALUNOS: ");
		JLabel listagem = new JLabel();
		listagem.setBackground(Color.gray);
		
		this.add(lista,BorderLayout.NORTH);
		this.add(listagem,BorderLayout.CENTER);
		this.setBorder(new LineBorder(Color.black));
		this.setVisible(false);
	}
}
