import java.io.*;

public class FaltaDePedidoException extends ErrorDePedidoException{
	public FaltaDePedidoException() {
		super("No hay suficiente articulos de ese pedido.");
	}
	public FaltaDePedidoException(String mss) {
		super(mss);
	}

}
