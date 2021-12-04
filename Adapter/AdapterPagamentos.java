package Adapter;
import zMastercard.CreditoMastercard;
import zMastercard.DebitoMastercard;
import zVisa.PagamentoVisa;

public class AdapterPagamentos implements IAdapterPagamentos {	

		
	public void pagar(String bandeira, double valor) {			
		
		
		if(bandeira == "MASTERCARD") {
			DebitoMastercard pagamento = new DebitoMastercard(valor);
			pagamento.pagarDebito();
		}
		
		
		if(bandeira == "VISA") {
			PagamentoVisa pagamento = new PagamentoVisa(valor);
			pagamento.processarDebito();
			
		}
		
	}
	
	
	
	
	
	public void pagar(String bandeira, double valor, int parcelas) {		
			
		if(bandeira == "MASTERCARD") {
			CreditoMastercard pagamento = new CreditoMastercard(valor, parcelas);
			pagamento.pagarCredito();
		}
		
		
		if(bandeira == "VISA") {
			PagamentoVisa pagamento = new PagamentoVisa(valor, parcelas);	
			pagamento.processarCredito();
		}
		
	}


}
