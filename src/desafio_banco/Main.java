package desafio_banco;

public class Main {

	public static void main(String[] args) {
		Cliente vitoria = new Cliente();
		vitoria.setNome("Vitória Carolina");
		
		Conta cc = new ContaCorrente(vitoria);
		Conta poupanca = new ContaPoupanca(vitoria);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}