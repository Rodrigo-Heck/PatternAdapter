package zMastercard;

public class CreditoMastercard {
	
	private double valor;
	private int parcelas;
	
	public CreditoMastercard(double valor, int parcelas) {
		this.valor = valor;
		this.parcelas = parcelas;
		
	}
	
	
	public void pagarCredito() {
		System.out.println("Mastercard Crédito: R$ " + this.valor + " em " + this.parcelas + "X");
	}


}
