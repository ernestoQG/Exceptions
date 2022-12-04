import java.io.*;

public class NoTieneDineroException extends ErrorDePedidoException{
	public NoTieneDineroException() {
		super("Lo sentimos pero usted no tiene dinero para realizar la compra.");
	}
	public NoTieneDineroException(String mss) {
		super(mss);
	}

}
