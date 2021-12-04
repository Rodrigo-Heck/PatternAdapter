package zVisa;

public class PagamentoVisa {
	
	private int parcelas;
	private double valor;

	public PagamentoVisa(double valor, int parcelas) {
		this.valor = valor;
		this.parcelas = parcelas;		
	}
	
	public PagamentoVisa(double valor) {
		this.valor = valor;		
	}
	
	public void processarCredito() {
		System.out.println("Visa Cr�dito: R$ " + this.valor + " em " + this.parcelas + "X");
	}
	
	public void processarDebito(){
		System.out.println("Visa D�bito: R$ " + this.valor);
	}
	
}
