import java.io.*;

public class TiendaCerradaException extends ErrorDeCompraException {
	public TiendaCerradaException() {
		super("No es horario para realizar la compra.");
	}
	public TiendaCerradaException(String mss) {
		super(mss);
	}

}
