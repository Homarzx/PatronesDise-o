package factory;
public class BasicaFactory implements TarjetaFactory{
	 private int limiteCredito;   
     private int costoAnual; 
	
	 

    public BasicaFactory(int limiteCredito, int costoAnual)  
    {  
    	limiteCredito=limiteCredito;
    	costoAnual=costoAnual;
    }  


	@Override
	public Tarjeta ObtenerTarjeta() {
		return new Basica(limiteCredito,costoAnual);
		
		
	}
	

}
