public class Pag60_Diretivas_for_simples_e_avançada {
	public static void main (String args[]) {

		/* •Diretiva/declaração (Statement): → Instrução (em Java são separadas por ;)
	 	 * •Bloco (blocks): → Grupo de diretivas/declarações (statements)
		 * •Cláusula (Clause): → Procedimento
	 	 * 
	 	 * ESTRUTURAS DE CONTROLE: 
	 	 * •1°-Estrutura de Repetição Simples: Cláusula for simples e Cláusula for avançada
	 	 * •2°-Estrutura de Repetição Condicionais: Cláusula while e Cláusula do while
	 	 * •3°-Estrutura de Desvio de Fluxo Condicional Simples: Cláusula if e Cláusula else
		 * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: Cláusula switch
		 * •5°-Estrutura de Desvio de Fluxo Incondicional: Cláusula break e Cláusula continue */


		/* 1°-Estruturas de Repetição Simples: Cláusula (Clause) for simples_______________________________________________________________________
		 * Semântica:
		 * for ([inicialização]; [condição]; [incremento ou decremento])
		 * 	< diretiva; ou { bloco } > */

		// Exemplo: Cláusula (Clause) for simples
		int j; // uma Diretiva(Statement) →(;)
		for (j=0; j<10; j++) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.println(j); //{ bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Cláusula (Clause) for simples
		for (int i=0; i<=10; i+=2) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento+=])
			System.out.println(i); //{ bloco }  →um grupo de diretivas(statments), ao invés de uma diretiva;
		}


		/* 1°-Estruturas de Repetição Simples: Cláusula (Clause) for avançada_______________________________________________________________________
		 * Semântica:
		 * for ([TipoElemento] <variável> : <espressão>)
		 * 	<diretiva; ou { bloco }>
		 */

		double arranjo[] = { 1.1964, 6.1995, 6.1935, 7.1931, 12.1968 }; // uma Diretiva(Statement) →(;)
		
		// Exemplo: Cláusula (Clause) for simples:
		System.out.print("For Comum: [ "); // uma Diretiva(Statement) →(;)
		int tamanho = arranjo.length; // uma Diretiva(Statement) →(;)
		for (int i=0; i<tamanho; i++) //Cláusula (Clause) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.print(arranjo[i] + " "); //diretiva; →ao invés de { bloco }, um grupo de diretivas(statments)

		// Exemplo: Cláusula (Clause) for avançada:
		System.out.print("For Avancado: [ "); // uma Diretiva(Statement) →(;)
		for (double elemento: arranjo) System.out.print(elemento + " "); //Cláusula (Clause) for avançado → ([TipoElemento] <variável> : <espressão>)
	}
}
