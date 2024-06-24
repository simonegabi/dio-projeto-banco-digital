public class Main {


	public static void main(String[] args) {
		Cliente simone = new Cliente();
		simone.setNome("Simone");

		Conta cc = new ContaCorrente(simone);
		Conta poupanca = new ContaPoupanca(simone);	

		cc.depositar(150);
		cc.transferir(150, poupanca);
        cc.transferir(40, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
