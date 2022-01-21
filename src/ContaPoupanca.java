
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String cliente,String cpf) {
		super(cliente, cpf);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();

    }
}
