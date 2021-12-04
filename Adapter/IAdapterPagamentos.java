package Adapter;

public interface IAdapterPagamentos {
	
	public void pagar(String bandeira, double valor);
	public void pagar(String bandeira, double valor, int parcelas);
}
