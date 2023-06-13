package InterfaceGrafica;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TelaDeCadastro extends JPanel  {
	private JTextField nomet;
	private JTextField matrt;
	private JTextField cpft;
	private JTextField vertt;
	public TelaDeCadastro(){
		makeTelaDeRegistro();
	}
	public void makeTelaDeRegistro() {;
		this.setLayout(new GridLayout(5,2,30,30));
		this.setBorder(new LineBorder(Color.black));
		JLabel temp = new JLabel();
		JLabel nome = new JLabel("NOME: ");
		JLabel matr = new JLabel("MATRICULA: ");
		JLabel cpf = new JLabel("CPF: ");
		JLabel vert =new JLabel("VERTENTE: ");
		nomet = new JTextField(5);
		matrt = new JTextField(5);
		cpft = new JTextField(5);
		vertt = new JTextField(5);
		
		Botao b= new Botao("Cadastrar",Color.cyan);
		b.addActionListener(new botaoCadastrar());
		
		this.add(nome);
		this.add(nomet);
		this.add(matr);
		this.add(matrt);
		this.add(cpf);
		this.add(cpft);
		this.add(vert);
		this.add(vertt);
		this.add(temp);
		this.add(b);
		this.setVisible(false);
	}
	private class botaoCadastrar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			String nome = nomet.getText();
			String matricula = matrt.getText();
			String cpf = cpft.getText();
			String vertente = vertt.getText();
			System.out.println(nome+" "+matricula+" "+cpf+" "+vertente);
		}
		
	}
}
