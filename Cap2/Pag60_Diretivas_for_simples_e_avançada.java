public class Pag60_Diretivas_for_simples_e_avançada {
	public static void main (String args[]) {

		/* •Diretivas(Statements): → São as instruções do programa, em Java são separadas por ;
	 	 * •Bloco: → São grupos de Diretivas(Statements)
	 	 * 
	 	 * ESTRUTURAS DE CONTROLE: 
	 	 * •1°-Estrutura de Repetição Simples: diretiva for simples e diretiva for avançada
	 	 * •2°-Estrutura de Repetição Condicionais: diretiva while e diretiva do while
	 	 * •3°-Estrutura de Desvio de Fluxo Condicional Simples: diretiva if e diretiva else
		 * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: diretiva switch
		 * •5°-Estrutura de Desvio de Fluxo Incondicional: diretiva break e diretiva continue */


		/* 1°-Estruturas de Repetição Simples: Diretiva(Statement) for simples_______________________________________________________________________
		 * Semântica:
		 * for ([inicialização]; [condição]; [incremento ou decremento])
		 * 	< diretiva; ou { bloco } > */

		// Exemplo: Diretiva(Statement) for simples
		int j; // uma Diretiva(Statement) →(;)
		for (j=0; j<10; j++) { //Diretiva(Statement) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.println(j); //{ bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Diretiva(Statement) for simples
		for (int i=0; i<=10; i+=2) { //Diretiva(Statement) for simples → ([inicialização]; [condição]; [incremento+=])
			System.out.println(i); //{ bloco }  →um grupo de diretivas(statments), ao invés de uma diretiva;
		}


		/* 1°-Estruturas de Repetição Simples: Diretiva(Statement) for avançada_______________________________________________________________________
		 * Semântica:
		 * for ([TipoElemento] <variável> : <espressão>)
		 * 	<diretiva; ou { bloco }>
		 */

		double arranjo[] = { 1.1964, 6.1995, 6.1935, 7.1931, 12.1968 }; // uma Diretiva(Statement) →(;)
		
		// Exemplo: Diretiva(Statement) for simples:
		System.out.print("For Comum: [ "); // uma Diretiva(Statement) →(;)
		int tamanho = arranjo.length; // uma Diretiva(Statement) →(;)
		for (int i=0; i<tamanho; i++) //Diretiva(Statement) for simples → ([inicialização]; [condição]; [incremento++])
			System.out.print(arranjo[i] + " "); //diretiva; →ao invés de { bloco }, um grupo de diretivas(statments)

		// Exemplo: Diretiva(Statement) for avançada:
		System.out.print("For Avancado: [ "); // uma Diretiva(Statement) →(;)
		for (double elemento: arranjo) System.out.print(elemento + " "); //Diretiva(Statement) for avançado → ([TipoElemento] <variável> : <espressão>)
	}
}
