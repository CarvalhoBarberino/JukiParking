import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Saida extends JFrame implements ActionListener {
	JFrame j;//Este objeto ainda n�o foi inicializado mas foi declarado. Sera utilizado mais tarde
	long tempoMs;// Tempo em milisegundos
	public Saida(JFrame janelaAFechar) {
		setTitle("JukiParking\\CadastrandoSaida");
		j = janelaAFechar;// j recebe a referencia da janela principal, que sera ocultada no actionPerformed
		JLabel lPlaca = new JLabel("Placa:");
		JTextField tPlaca = new JTextField(10);
		add(lPlaca);
		add(tPlaca);
		JButton botaoOk = new JButton("Ok");
		JButton botaoVoltar = new JButton("Voltar");
		JLabel lHoras = new JLabel();
		lHoras.setText("");
		setSize(403, 250);
		setLocation(150, 150);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(botaoOk);
		botaoOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try{
					FileInputStream fi = new FileInputStream("Registros.dat");
					ObjectInputStream oi = new ObjectInputStream(fi);
					Gravavel x =(Gravavel) oi.readObject();
					oi.close();
					for(int i = x.vetorRegistros.size() - 1; i >= 0; i--) {
						System.out.println("Lendo " + x.vetorRegistros.get(i).placa + " " + x.vetorRegistros.get(i).modelo + " " + x.vetorRegistros.get(i).cor);
						if((x.vetorRegistros.get(i).placa.equals(tPlaca.getText())) && (x.vetorRegistros.get(i).dataSaida == null)) {
							System.out.println("Achado " + x.vetorRegistros.get(i).placa + " " + x.vetorRegistros.get(i).modelo + " " + x.vetorRegistros.get(i).cor);
							x.vetorRegistros.get(i).dataSaida = new Date();
							tempoMs = x.vetorRegistros.get(i).dataSaida.getTime() - x.vetorRegistros.get(i).dataEntrada.getTime();
							lHoras.setText(String.valueOf((float)(tempoMs/3600000)) + " horas no estacionamento\nTotal a pagar: R$" + String.valueOf((float)(12 * tempoMs/3600000)));
						}
					}
					FileOutputStream fo = new FileOutputStream("Registros.dat");
					ObjectOutputStream oo = new ObjectOutputStream(fo);
					x.timeStamp = new Date();
					x.seq++;
					System.out.println("seq = " + x.seq);
					oo.writeObject(x);
					oo.close();
				}
				catch(Exception err){err.printStackTrace();}
			}
		});
		add(botaoVoltar);
		botaoVoltar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tPlaca.setText("");//resetar Strings
				j.setVisible(true);
				dispose();
			}
		});
		add(lHoras);
	}
	
	@Override
public void actionPerformed(ActionEvent e) {
		new JFrame();
		j.setVisible(false);//oculta a janela principal
		setVisible(true);
	}

}
