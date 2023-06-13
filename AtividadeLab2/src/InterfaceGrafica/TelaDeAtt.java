package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TelaDeAtt extends JPanel{
	private JTextField matrt;
	private JTextField vertt;
	
	public TelaDeAtt() {
		makeTelaDeAtt();
	}
	public void makeTelaDeAtt() {
		this.setLayout(new GridLayout(3,2,20,20));
		this.setBorder(new LineBorder(Color.black));
		JLabel temp = new JLabel();
		JLabel matr = new JLabel("MATRICULA: ");
		JLabel vert =new JLabel("VERTENTE: ");
		matrt = new JTextField(5);
		vertt = new JTextField(5);
		
		Botao b= new Botao("Atualizar",Color.cyan);
		b.addActionListener(new botaoAtt());
		
		this.add(matr);
		this.add(matrt);
		this.add(vert);
		this.add(vertt);
		this.add(temp);
		this.add(b);
		this.setVisible(false);
	}
	private class botaoAtt implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String matricula = matrt.getText();
			String vertente = vertt.getText();
			System.out.println(matricula+" "+vertente);
		}
		
	}
}
