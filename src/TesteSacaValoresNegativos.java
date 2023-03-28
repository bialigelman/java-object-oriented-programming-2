
public class TesteSacaValoresNegativos {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		conta.saca(300);
		System.out.println(conta.getSaldo());
		
		/* Má prática
		 * conta.saldo = conta.saldo - 101; System.out.println(conta.saldo);
		 */	
		
		
	}
	
}
