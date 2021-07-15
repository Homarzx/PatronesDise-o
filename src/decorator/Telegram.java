package decorator;

public class Telegram extends BaseDecorator{

	public Telegram(Notificable e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		
		return getNotificador().getMessage()+"  Telegram";
	}

}
