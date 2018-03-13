import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Gravavel  implements Serializable{
	ArrayList<Registro> vetorRegistros;
	Date timeStamp;
	int seq;
	public Gravavel() {
		vetorRegistros = new ArrayList<Registro>();
		timeStamp = new Date();
		seq = 0;
	}
}
