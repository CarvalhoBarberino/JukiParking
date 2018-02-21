import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Entrada extends JFrame implements ActionListener{
	JFrame j;//Este objeto ainda não foi inicializado mas foi declarado. Sera utilizado mais tarde
	public Entrada(JFrame janelaAFechar) {//O metodo construtor recebe a referencia a janela principal.
		System.out.println("fim do Entrada()");
		j = janelaAFechar;// j recebe a referencia da janela principal, que sera ocultada no actionPerformed
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		new JFrame();
		setTitle("JukiParking\\CadastrandoCarro");
		j.setVisible(false);//oculta a janela principal
		JButton botaoCarroEntrando = new JButton("bla bla");
		JButton botaoCarroSaindo = new JButton("bla bla bla");
		setSize(403, 250);
		setLocation(150, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(botaoCarroEntrando);
		add(botaoCarroSaindo);
		setVisible(true);
	}

}
