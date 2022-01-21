public class ContaCorrente extends Conta {

	public ContaCorrente(String cliente, String cpf) {
		super(cliente, cpf);
	}


	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
