import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Entrada extends JFrame implements ActionListener{
	JFrame j;//Este objeto ainda n�o foi inicializado mas foi declarado. Sera utilizado mais tarde
	public Entrada(JFrame janelaAFechar) {//O metodo construtor recebe a referencia a janela principal.
		setTitle("JukiParking\\CadastrandoCarro");
		j = janelaAFechar;// j recebe a referencia da janela principal, que sera ocultada no actionPerformed
		JButton botaoOk = new JButton("Ok");
		JButton botaoCancelar = new JButton("Cancelar");
		setSize(403, 250);
		setLocation(150, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(botaoOk);
		add(botaoCancelar);
		botaoCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				setVisible(false);
				j.setVisible(true);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		new JFrame();
		
		j.setVisible(false);//oculta a janela principal
		setVisible(true);
	}

}
