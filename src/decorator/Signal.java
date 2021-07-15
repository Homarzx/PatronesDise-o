package decorator;

public class Signal extends BaseDecorator {

	public Signal(Notificable e) {
		super(e);
	}

	@Override
	public String getMessage() {
		
		return getNotificador().getMessage()+ "Signal";
	}

}
