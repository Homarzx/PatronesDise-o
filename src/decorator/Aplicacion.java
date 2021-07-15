package decorator;

public class Aplicacion {
	public static void main(String[] args) {
		Notificable notificacion=new Correo();
		notificacion=new WhatsApp(notificacion);
		notificacion=new Telegram(notificacion);
		System.out.println(notificacion.getMessage());
		
	}

}
