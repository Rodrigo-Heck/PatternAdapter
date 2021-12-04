package AutoPagamento;
import Mastercard.PagamentoMastercard;
import Visa.PagamentoVisa;

public class AdapterPagamentos implements IAdapterPagamentos {	

	
	public void pagar(String bandeira) {
		
		
		
		if(bandeira == "Mastercard") {
			PagamentoMastercard pagamento = new PagamentoMastercard();
			pagamento.processaPagamento();
		}
		
		if(bandeira == "Visa") {
			PagamentoVisa pagamento = new PagamentoVisa();
			pagamento.processaPagamento();
		}
		
	}



}
