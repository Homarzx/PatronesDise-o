package factory;

public class PremiunFactory implements TarjetaFactory{
	 private int limiteCredito;   
     private int costoAnual; 
	
	 

    public PremiunFactory(int limiteCredito, int costoAnual)  
    {  
    	limiteCredito=limiteCredito;
    	costoAnual=costoAnual;
    }  


	@Override
	public Tarjeta ObtenerTarjeta() {
		return new Premiun(limiteCredito,costoAnual);
		
		
	}
	

}
