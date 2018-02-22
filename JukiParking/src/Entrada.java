import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Entrada extends JFrame implements ActionListener{
	JFrame j;//Este objeto ainda n�o foi inicializado mas foi declarado. Sera utilizado mais tarde
	public Entrada(JFrame janelaAFechar) {//O metodo construtor recebe a referencia a janela principal.
		setTitle("JukiParking\\CadastrandoCarro");
		j = janelaAFechar;// j recebe a referencia da janela principal, que sera ocultada no actionPerformed
		JLabel lPlaca = new JLabel("Placa:");
		JTextField tPlaca = new JTextField(10);
		JLabel lmodelo = new JLabel("Modelo:");
		JTextField tModelo = new JTextField(15);
		JLabel lCor = new JLabel("Cor:");
		JTextField tCor = new JTextField(12);
		add(lPlaca);
		add(tPlaca);
		add(lmodelo);
		add(tModelo);
		add(lCor);
		add(tCor);
		JButton botaoOk = new JButton("Ok");
		JButton botaoCancelar = new JButton("Cancelar");
		setSize(403, 250);
		setLocation(150, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(botaoOk);
		botaoOk.addActionListener(new SalvarNoArquivo(tPlaca, tModelo, tCor));
		add(botaoCancelar);
		botaoCancelar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tPlaca.setText("");//resetar Strings
				tModelo.setText("");//resetar Strings
				tCor.setText("");//resetar Strings
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
