package SistemaDePagamentos;

import Adapter.AdapterPagamentos;
import Adapter.IAdapterPagamentos;
import zMastercard.CreditoMastercard;
import zMastercard.DebitoMastercard;
import zVisa.PagamentoVisa;

public class PagamentoComAdapter {
	
	public static void main(String[] args) {
		
		IAdapterPagamentos pagamento = new AdapterPagamentos();	
		
		pagamento.pagar("MASTERCARD", 10000, 12);
		pagamento.pagar("MASTERCARD", 100);
		pagamento.pagar("VISA", 500, 1);
		pagamento.pagar("VISA", 70);
		
		
		
		
	}

}
