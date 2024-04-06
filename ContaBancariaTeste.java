package contaBancaria;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta = new ContaBancaria(1, 1000, "Pedro");
		
		conta.deposito(1500);
		conta.sacar(700);
		
		//System.out.println(conta.getSaldo());
		

	}

}
