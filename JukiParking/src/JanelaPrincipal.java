import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JanelaPrincipal extends JFrame{
	public JanelaPrincipal() {
		new JFrame();
		setTitle("JukiParking");
		JButton botaoCarroEntrando = new JButton("Carro entrando no estacionamento");
		JButton botaoCarroSaindo = new JButton("Carro saindo no estacionamento");
		setSize(805, 500);
		setLocation(100, 100);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(botaoCarroEntrando);
		add(botaoCarroSaindo);
		botaoCarroEntrando.addActionListener(new Entrada(this));//O construtor da classe entrada será executado neste momento. A palavra chave "this" vai transmitir o proprio objeto para o construtor da classe Entrada
		//botaoCarroSaindo.addActionListener(new Saida());
		setVisible(true);
		System.out.println("fim do JanelaPrincipal()");
	}
}
