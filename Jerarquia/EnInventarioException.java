import java.io.*;

public class EnInventarioException extends TiendaCerradaException{
	public EnInventarioException() {
		super("Estamos ahora mismo revisando el inventario espere un momento.");
	}
	public EnInventarioException(String mss {
		super(mss);
	}
}
