import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

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
		Registro registroDeEntrada = new Registro(placaS.getText(), modeloS.getText(), corS.getText());
		try{
			FileOutputStream fo = new FileOutputStream("Registros.dat");
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			Gravavel x = new Gravavel();
			x.vetorRegistros.add(registroDeEntrada);
			x.timeStamp = new Date();
			x.seq = 1;
			oo.writeObject(x);
			oo.close();}
		catch(Exception err){err.printStackTrace();}
		
	}
}
