public class Pag65_diretiva_if_e_else {
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


		/* 3°-Estrutura de Desvio de Fluxo Condicional Simples: Diretiva(Statement) if e else_________________________________________________________
		 * Semântica:
		 * if ( < condição > )
		 * 	< diretiva1; ou { bloco1 }>
		 * else
		 *  < diretiva1; ou { bloco1 }> 
		 * OBS: A sintaxe Java determina que uma cláusula else sempre pertence à diretiva if imediatamente anterior.
		 * O uso de chaves{} permite modificar esta regra: */
		
		// Exemplo: Diretiva(Statement) if e else:
		int a = 80, b = 50;
		if (a > b) { // condição1 → se a chave fosse após a condição2 então else seria pertencente à diretiva if da condição2
			if (a > 80) // condição2
			System.out.println("a > b && a > 80"); // diretiva2
		} else { //else pertence à diretiva if da condição1, graças às chaves{}
			System.out.println("a < b"); // diretiva2
		}

		// Exemplo: Diretiva(Statement) if e else:
		if (args.length > 0) { // testa presença de argumentos
			// converte 1o argumento para inteiro
			int max = Integer.parseInt(args[0]);
			for (int j=0; j<max; j++) {
				System.out.print(j + " ");
			}
			System.out.println("\nFim da Contagem");
		}
		else System.out.println("Fim do Programa");
	}
}
