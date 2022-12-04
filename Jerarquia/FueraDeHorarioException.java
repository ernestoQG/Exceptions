import java.io.*;

public class FueraDeHorarioException extends TiendaCerradaException {
	public NombreException() {
		super("La tienda esta cerrada, ya es muy tarde, hasta mañana.");
	}
	public NombreException(String mss) {
		super(mss);
	}

}
