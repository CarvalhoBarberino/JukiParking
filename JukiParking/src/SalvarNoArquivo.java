import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class SalvarNoArquivo implements ActionListener{
	JTextField placaS, modeloS, corS;
	public SalvarNoArquivo(JTextField tPlaca, JTextField tModelo, JTextField tCor) {
		placaS = tPlaca;
		modeloS = tModelo;
		corS = tCor;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("SalvarNoArquivo.actionPerformed(ActionEvent e)");
		System.out.println(placaS.getText());
		System.out.println(modeloS.getText());
		System.out.println(corS.getText());
	}
}
