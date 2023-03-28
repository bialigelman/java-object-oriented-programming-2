
public class TestaContaSemCliente {

	public static void main(String[] args) {
		/*
		 * Code that generates Exception Error
		 * 
		 * Conta contaDaMarcela = new Conta(); System.out.println(contaDaMarcela.saldo);
		 * 
		 * System.out.println(contaDaMarcela.titular);
		 * 
		 * contaDaMarcela.titular.nome = "Marcela";
		 * System.out.println(contaDaMarcela.titular.nome);
		 * 
		 * 
		 */
		
		Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

        contaDaMarcela.titular = new Cliente();
        System.out.println(contaDaMarcela.titular);

        contaDaMarcela.titular.nome = "Marcela";
        System.out.println(contaDaMarcela.titular.nome); 
	}

}
