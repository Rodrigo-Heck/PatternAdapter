package zMastercard;

public class DebitoMastercard {
	
	private double valor;
		
	
	public DebitoMastercard(double valor) {		
		this.valor = valor;		
	}

	
	public void pagarDebito() {
		System.out.println("Mastercard D�bito: R$ " + this.valor);
	}



	
	
	
	



}
