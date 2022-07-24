import java.util.Scanner;
public class Pag62_Diretiva_While_e_DoWhile {
	@SuppressWarnings("resource")
	public static void main (String args[]) {

		/* •Diretiva/declaração (Statement): → Instrução do programa (em Java são separadas por ;)
	 	 * •Bloco (blocks): → Grupo de diretivas/declarações (statements)
		 * •Cláusula (Clause): → Procedimento nativo da liguagem
	 	 * 
	 	 * ESTRUTURAS DE CONTROLE: 
	 	 * •1°-Estrutura de Repetição Simples: Cláusula for simples e Cláusula for avançada
	 	 * •2°-Estrutura de Repetição Condicionais: Cláusula while e Cláusula do while
	 	 * •3°-Estrutura de Desvio de Fluxo Condicional Simples: Cláusula if e Cláusula else
		 * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: Cláusula switch
		 * •5°-Estrutura de Desvio de Fluxo Incondicional: Cláusula break e Cláusula continue */

		/* 2°-Estruturas de Repetição Condicional: Cláusula (Clause) while_________________________________________________________________________
		 * Semântica:
		 * 	while ( < condição > )
		 * 		< diretiva; ou { bloco } > */

		// Exemplo: Cláusula (Clause) while:
		Scanner s = new Scanner(System.in); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro para while: "); // uma Diretiva(Statement) →(;)
		int j = s.nextInt(); // uma Diretiva(Statement) →(;)
		while (j >= 0) { // Diretiva(Statement) while → ( < condição > )
			System.out.println("(while) " + j); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			j--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Cláusula (Clause) for simples equivalente (1°-Estrutura de Repetição Simples):
		// OBS: A DIRETIVA FOR MOSTROU-SE SER DE MENOR TEMPO DE EXECUÇÃO PARA EM COMPARAÇÃO COM A DIRETIVA WHILE (PARA ESSA INSTRUÇÃO)!
		System.out.print("Valor inteiro para for: ");
		int i = s.nextInt();
		for (; i>=0; i--) { //Cláusula (Clause) for simples → ([inicialização]; [condição]; [decremento--])
			System.out.println("(for simples) " + i); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		/* 2°-Estruturas de Repetição Condicional: Cláusula (Clause) do while______________________________________________________________________
		 * Semântica:
		 * 	do {
		 * 		diretiva;
		 * } while ( < condição > ); */

		// Exemplo: Cláusula (Clause) do while:
		System.out.print("Valor inteiro inferior: "); // uma Diretiva(Statement) →(;)
		int min = s.nextInt(); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro superior: "); // uma Diretiva(Statement) →(;)
		int max = s.nextInt(); // uma Diretiva(Statement) →(;)
		
		do {
			System.out.println(min + " < " + max); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			min++; max--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		} while (min < max); // Cláusula (Clause) while → ( < condição > );

		System.out.println(min + " == " + max + " Valores igualados!"); // uma Diretiva(Statement) →(;)
	}

}
