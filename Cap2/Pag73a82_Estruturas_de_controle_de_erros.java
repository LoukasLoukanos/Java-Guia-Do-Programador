public class Pag73a82_Estruturas_de_controle_de_erros {
	public static void main (String args[]) {

		/* Controle de erros com try catch finally e assert
		 * Sintaxe:
		 * 	try [(recurso = inicialização)] {
		 *		diretivas;
		 * } catch ( <exceptin1> ) {
		 *		diretiva_de_tratamento_de_erro1;
		 * } [ catch ( <exceptin2> ) {
		 *		diretiva_de_tratamento_de_erro2;
		 * }] [ finaly {
		 *		diretiva_de_execução_garantida;
		 * }]
		 *
		 * obs:a cláusula finaly garante a execução de um trecho final de código. */

		 
		//Aplicação com teste convencional(sem controle de erros com a diretiva try catch)
		if (args.length > 0) { // testa presença de argumentos
			// converte 1o argumento em inteiro
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} else { // sinaliza problema
			System.out.println("Falta um argumento inteiro.");
		}


		//Aplicação com uso de controle de erros com a diretiva try catch)
		try { // Tentativa
			// converter 1o argumento em inteiro
			int i = Integer.parseInt(args[0]);
			while (i >= 0) {
				System.out.println(i); 
				i--;
			}
		} catch (Exception e) { // sinaliza problemas encontrados. Com o uso de Exception será tratado qualquer tipo de erro.
			System.out.println("Argumento nao foi dado ou nao e inteiro.");
		}


		//Usando várias cláusulas catch
		try { // Tentativa
			// converte 1o argumento em inteiro
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {// Captura o erro de falta de argumentos
			System.out.println("Nao foi fornecido um argumento.");

		} catch (NumberFormatException e2) { // Captura o erro de argumento inadequado
			System.out.println("Argumento nao e um inteiro.");
		}


        // Capturar várias exceções diferrentes em uma única clausula multi-catch com o uso de → |
		try { // Tentativa
			// converte 1o argumento em inteiro
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {  // Captura dois erros através do uso do multi-catch → |: o erro de falta de argumentos e de argumento inadequado
			System.out.println("Argumento nao fornecido ou invalido.");
		} 
	}
}
