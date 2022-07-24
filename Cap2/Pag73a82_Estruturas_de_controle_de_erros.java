import java.io.*; // linha 91

public class Pag73a82_Estruturas_de_controle_de_erros {
	public static void main (String args[]) {

		/* •Diretiva/declaração (Statement): → Instrução do programa (em Java são separadas por ;)
	 	 * •Bloco (blocks): → Grupo de diretivas/declarações (statements)
		 * •Cláusula (Clause): → Procedimento nativo da liguagem
		 * 
		 * ♦Controle de erros com as cláusulas try catch finally e assert
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
		 * obs: a cláusula finaly garante a execução de um trecho final de código. */

		 
		//Aplicação com teste convencional(sem controle de erros com a diretiva try catch)
		if (args.length > 0) { // testa presença de argumentos
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} else { // sinaliza problema
			System.out.println("Falta um argumento inteiro.");
		}


		//Aplicação com uso de controle de erros com a diretiva try catch)
		try { // Tentativa
			int i = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (i >= 0) {
				System.out.println(i); 
				i--;
			}
		} catch (Exception e) { // sinaliza problemas encontrados. Com o uso de Exception será tratado qualquer tipo de erro.
			System.out.println("Argumento nao foi dado ou nao e inteiro.");
		}


		//Usando várias cláusulas catch
		try { // Tentativa
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
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
			int j = Integer.parseInt(args[0]); // converte 1o argumento em inteiro
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) { // Captura dois erros através do uso do multi-catch → |: o erro de falta de argumentos e de argumento inadequado
			System.out.println("Argumento nao fornecido ou invalido.");
		} 


		// Gerando um trexo final sempre executável diante da diretiva catch, através da cláusula finaly.
		int p = 5; // valor default
		try { // Tentativa
			p = Integer.parseInt(args[0]);
		} catch (Exception e) { // sinaliza problemas encontrados. Com o uso de Exception será tratado qualquer tipo de erro.
			System.out.println("Argumento invalido ou ausente. Usando default.");
		} finally { // execução de um trecho final de código com a cláusula finaly, independente execução da diretiva catch
			while (p >= 0) {	
				System.out.println(p);
				p--;
			}
		}


		/* try catch para realização monitorada da operação close(), para 'recurso_try_sem_recurso', utilizando a cláusula finally 
		 * com a estrutura de desvio de fluxo condicional simples, cláusula (Clause) if - (Pag65_.java...).  Se mostra uma tarefa 
		 * repetitiva cujo código resultante é pouco legível. A solução, para um código mais legível, é fazer uso do Automatic
		 * Resource Management (ARM) ou try-com-recursos (try-with-resources), abaixo ↓↓↓. */
		// Exemplo 1 - de código pouco legível SEM uso do recurso try-com-recurso—————————————————————————————————————————————————
		InputStream recurso_try_sem_recurso = null;
		try { // ♦tentativa SEM uso do recurso try-com-recurso
			recurso_try_sem_recurso = new FileInputStream(args[0]); 
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) { // ♦captura o erro da tentativa
			System.out.println(e1); 
		// Realização monitorada da operação close(), para 'recurso_try_sem_recurso', COM finally e COM if: ↓↓↓
		} finally {
			if (recurso_try_sem_recurso != null) try { // ♦tentativa SEM uso do recurso try-com-recurso
				recurso_try_sem_recurso.close();
				System.out.println("Arquivo " + args[0] + " fechado.");
			} catch (IOException e2) {} // ♦captura o erro da tentativa
		} //Exemplo 1 - FIM_______________________________________________________________________________________________________

		// Exemplo 2 - de código mais legível COM uso do recurso try-com-recurso——————————————————————————————————————————————————
		// Realização monitorada da operação close(), para 'recurso_try_com_recurso', SEM finally e SEM if: ↓↓↓
		try (InputStream recurso_try_com_recurso = new FileInputStream(args[0]);) { // ♦tentativa COM uso do recurso try-com-recurso
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) { // ♦captura o erro da tentativa
			System.out.println(e1);
		}
		System.out.println("Arquivo " + args[0] + " fechado.");
		//Exemplo 2 - FIM_________________________________________________________________________________________________________
	}
}
