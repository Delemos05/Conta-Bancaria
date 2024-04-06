package contaBancaria;

public class ContaBancaria {
		private int id = 0;
		private double saldo;
		private String titular;
		
		public ContaBancaria(int id, double saldo, String titular) {
			this.id = id;
			this.saldo = saldo;
			this.titular = titular;
			System.out.println("Senhor(a): " + titular + " seu número da conta é: " + id + "e o seu saldo é de: " + saldo);
		}
		

		public double getSaldo() {
			return saldo;
		}

		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}

		public void deposito(double valor) {
			this.saldo = saldo + valor;
			System.out.println("Você depositou: " + valor);
			System.out.println("O seu saldo atual é de: " + saldo);
		}
	
	public void sacar(double valor) {
		this.saldo = saldo - valor;
		System.out.println("Você sacou :" + valor + "da sua conta");
	}
	
	public void abrirConta(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
		this.id = id + 1;
		System.out.println("Senhor(a): " + titular + "seu número da conta é: " + id+"e seu saldo é de: " + saldo);
	}
	

}
