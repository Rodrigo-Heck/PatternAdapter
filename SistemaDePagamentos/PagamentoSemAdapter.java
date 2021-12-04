package SistemaDePagamentos;
import zMastercard.CreditoMastercard;
import zMastercard.DebitoMastercard;
import zVisa.PagamentoVisa;

public class PagamentoSemAdapter {

	public static void main(String[] args) {
		
		CreditoMastercard creditoMastercard = new CreditoMastercard(10000, 12); 
		DebitoMastercard debitoMastercard = new DebitoMastercard(100); 
		PagamentoVisa creditoVisa = new PagamentoVisa(500, 1);
		PagamentoVisa debitoVisa = new PagamentoVisa(70);
		
		
		creditoMastercard.pagarCredito();
		debitoMastercard.pagarDebito();
		creditoVisa.processarCredito();
		debitoVisa.processarDebito();

	}

}
