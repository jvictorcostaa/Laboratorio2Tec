package InterfaceGrafica;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TelaPrincipal extends JFrame{
	public JPanel Telaregistro;
	public JPanel Telalistar;
	public JPanel Telaatt;
	public JPanel Teladeletar;
	public JPanel[] telas;
	
	public TelaPrincipal() {
		this.setLayout(new BorderLayout());
		this.setSize(500,500);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setResizable(false);
		telas = new JPanel[4];
		
		Telaregistro = new TelaDeCadastro();
		telas[0] = Telaregistro;
		
		Telalistar = new TelaDeLista();
		telas[1] = Telalistar;
		
		Telaatt = new TelaDeAtt();
		telas[2] = Telaatt;
		
		Teladeletar = new TelaDeDel();
		telas[3] = Teladeletar;
		
		PainelBotoes painelBotoes = new PainelBotoes(this);
		this.add(painelBotoes,BorderLayout.NORTH);
		
		JPanel painelGenerico = new JPanel();
		painelGenerico.setBackground(Color.LIGHT_GRAY);
		painelGenerico.add(Telaregistro);
		painelGenerico.add(Telalistar);
		painelGenerico.add(Telaatt);
		painelGenerico.add(Teladeletar);
		
		this.add(painelGenerico, BorderLayout.CENTER);
		this.setVisible(true);
	}
	
	public JLabel makeJlabel(String str) {
		JLabel l = new JLabel();
		l.setForeground(Color.black);
		l.setText(str);
		return l;
	}
	public JTextField makeJText() {
		JTextField t = new JTextField();
		setSize(50,20);
		return t;
	}
	public void atualizarPaineis(int seletorDePainel) {
		
		for(int i=0; i<telas.length; i++) {
			if(i==seletorDePainel) {
				telas[i].setVisible(true);
			} else {
				telas[i].setVisible(false);
			}
		}
		
	}
	
//	public JLabel makeJlabel(Color c) {
//		JLabel l = new JLabel();
//		l.setBackground(c);
//		l.setBorder(new LineBorder(Color.white));
//		return l;
//	}
}
