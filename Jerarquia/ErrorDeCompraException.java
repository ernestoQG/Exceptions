import java.io.*;

public class ErrorDeCompraException extends Exception{
	public ErrorDeCompraException() {
		super("No se a podido realizar la compra");
	}
	public ErrorDeCompraException(String mss) {
		super(mss);
	}

}
