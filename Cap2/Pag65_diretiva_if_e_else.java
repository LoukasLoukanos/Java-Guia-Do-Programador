public class Pag65_diretiva_if_e_else {
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


		/* 3°-Estrutura de Desvio de Fluxo Condicional Simples: Cláusula (Clause) if e else_________________________________________________________
		 * Semântica:
		 * if ( < condição > )
		 * 	< diretiva1; ou { bloco1 }>
		 * else
		 *  < diretiva1; ou { bloco1 }> 
		 * OBS: A sintaxe Java determina que uma cláusula else sempre pertence à diretiva if imediatamente anterior.
		 * O uso de chaves{} permite modificar esta regra: */
		
		// Exemplo: Cláusula (Clause) if e else:
		int a = 80, b = 50;
		if (a > b) { // condição1 → se a chave fosse após a condição2 então else seria pertencente à diretiva if da condição2
			if (a > 80) // condição2
			System.out.println("a > b && a > 80"); // diretiva2
		} else { //else pertence à diretiva if da condição1, graças às chaves{}
			System.out.println("a < b"); // diretiva2
		}

		// Exemplo: Cláusula (Clause) if e else:
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
