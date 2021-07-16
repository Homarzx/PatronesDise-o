package decorator;

public class Correo extends Notificafor {

	@Override
	public String getMessage() {
		return "Mensaje de correo";
	}

}
