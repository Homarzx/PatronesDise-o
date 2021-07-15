package factory;

public class VipFactory implements TarjetaFactory{
	 private int limiteCredito;   
     private int costoAnual; 
	
	 

    public VipFactory(int limiteCredito, int costoAnual)  
    {  
    	limiteCredito=limiteCredito;
    	costoAnual=costoAnual;
    }  


	@Override
	public Tarjeta ObtenerTarjeta() {
		return new Vip(limiteCredito,costoAnual);
		
		
	}

}
