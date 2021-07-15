package decorator;

public class WhatsApp extends BaseDecorator{

	public WhatsApp(Notificable e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		return getNotificador().getMessage()+"  WhatsApp";
		
	}

}
