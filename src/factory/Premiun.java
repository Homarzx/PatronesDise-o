package factory;

public class Premiun extends Tarjeta{
	 private int limiteCredito;   
     private int costoAnual; 
	
	 

    public Premiun(int limiteCredito, int costoAnual)  
    {  
    	limiteCredito=limiteCredito;
    	costoAnual=costoAnual;
    }  

    public int getlimiteCredito() {
        return this.limiteCredito;
    }

    public void setlimiteCredito(int limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public int getcostoAnual() {
        return this.costoAnual;
    }

    public void setcostoAnual(int costoAnual) {
        this.costoAnual = costoAnual;
    }

}
