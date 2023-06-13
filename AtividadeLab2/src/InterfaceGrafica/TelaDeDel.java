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

public class TelaDeDel extends JPanel{
	JTextField matrt;
	public TelaDeDel() {
		makeTelaDeDel();
	}
	public void makeTelaDeDel() {
		this.setLayout(new GridLayout(2,2,20,20));
		this.setBorder(new LineBorder(Color.black));
		JLabel temp = new JLabel();
		JLabel matr = new JLabel("MATRICULA: ");
		matr.setBounds(80, 50, 100, 20);
		matrt = new JTextField();
		
		Botao b= new Botao("Deletar",Color.cyan);
		b.addActionListener(new botaoDeletar());
		
		this.add(matr);
		this.add(matrt);
		this.add(temp);
		this.add(b);
		this.setVisible(false);
	}
private class botaoDeletar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String matricula = matrt.getText();
			System.out.println(matricula);
		}
		
	}
	
}
