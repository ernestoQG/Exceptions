import java.io.*;

public class ErrorDePedidoException extends ErrorDeCompraException{
	public ErrorDePedidoException() {
		super("Ha ocurrido un error en el pedido.");
	}
	public ErrorDePedidoException(String mss) {
		super(mss);
	}

}
