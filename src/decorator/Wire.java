package decorator;

public class Wire extends BaseDecorator{

	public Wire(Notificable e) {
		super(e);
		
	}

	@Override
	public String getMessage() {
		
		return getNotificador().getMessage()+ "Wire";
	}

}
