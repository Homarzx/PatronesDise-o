package decorator;

public abstract class BaseDecorator implements Notificable{
    protected Notificable wrapper;
    public BaseDecorator(Notificable e) {
    	wrapper=e;
    		
    }
    public Notificable getNotificador() {
		return wrapper;
    	
    }
    public void setNotificable(Notificable wrapper) {
    	this.wrapper=wrapper;
    }
	

}
