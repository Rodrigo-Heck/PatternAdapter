package AutoPagamento;

public class SistemaDePagamentos {
	
	public static void main(String[] args) {
		
		AdapterPagamentos pagamento = new AdapterPagamentos();
		
		pagamento.pagar("Mastercard");
		pagamento.pagar("Visa");

		
		
		
	}

}
