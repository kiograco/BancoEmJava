import java.util.Scanner;

public class Main {
	private static int opcao;
	private static double valor;


	public static void main(String[] args) {
		Scanner imput = new Scanner(System.in);
		System.out.println("Digite o Nome do Cliente");
		String nome = imput.nextLine();
		System.out.println("Digite o CPF do Cliente");
		String cpf;
		cpf = imput.nextLine();

		ContaCorrente c1 = new ContaCorrente(nome,cpf);
		String caio = imput.nextLine();
		ContaCorrente c2 = new ContaCorrente("caio","08352001400");



		do{
			System.out.println("MENU");
			System.out.println("1) Dados Bancarios");
			System.out.println("2) Deposito");
			System.out.println("3) saque");
			System.out.println("4) transferir");
			System.out.println("0) Sair");

			System.out.println("Opcao: ");
			opcao = imput.nextInt();
			if(opcao == 1){
				c1.imprimirExtrato();

			}if(opcao == 2){
				valor = imput.nextDouble();
				c1.depositar(valor);

			}if(opcao == 3){
				valor = imput.nextDouble();
				c1.sacar(valor);

			}if(opcao == 4){
				valor = imput.nextDouble();
				c1.transferir(valor,c2 );

			}if(opcao == 0){

			}else{
				System.out.println("digite uma opção valida");
			}


		}while (opcao != 0);
	}



}
