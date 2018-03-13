import java.io.Serializable;
import java.util.Date;

public class Registro implements Serializable{
		Date dataEntrada;
		Date dataSaida;
		String placa;
		String modelo;
		String cor;
		public Registro(String placaArg, String modeloArg, String corArg) {
			dataEntrada = new Date();
			dataSaida = null;
			placa = placaArg;
			modelo = modeloArg;
			cor = corArg;
		}
		public void marcarSaida() {
			dataSaida = new Date();
		}
	}