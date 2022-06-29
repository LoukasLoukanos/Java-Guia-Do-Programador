import java.util.Scanner;
public class Pag62_Diretiva_While_e_DoWhile {
	@SuppressWarnings("resource")
	public static void main (String args[]) {

		/* •Diretivas(Statements): → São as instruções do programa, em Java são separadas por ;
	 	 * •Bloco: → São grupos de Diretivas(Statements)
	 	 * 
	 	 * ESTRUTURAS DE CONTROLE: 
	 	 * •1°-Estrutura de Repetição Simples: diretiva for simples e diretiva for avançada
	 	 * •2°-Estrutura de Repetição Condicional: diretiva while e diretiva do while
	 	 * •3°-Estrutura de Desvio de Fluxo Condicional Simples: diretiva if e diretiva else
		 * •4°-Estrutura de Desvio de Fluxo Condicional Múltiplo: diretiva switch
		 * •5°-Estrutura de Desvio de Fluxo Incondicional: diretiva break e diretiva continue */

		/* 2°-Estruturas de Repetição Condicional: Diretiva(Statement) while_________________________________________________________________________
		 * Semântica:
		 * 	while ( < condição > )
		 * 		< diretiva; ou { bloco } > */

		// Exemplo: Diretiva(Statement) while:
		Scanner s = new Scanner(System.in); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro para while: "); // uma Diretiva(Statement) →(;)
		int j = s.nextInt(); // uma Diretiva(Statement) →(;)
		while (j >= 0) { // Diretiva(Statement) while → ( < condição > )
			System.out.println("(while) " + j); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			j--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		// Exemplo: Diretiva(Statement) for simples equivalente (1°-Estrutura de Repetição Simples):
		// OBS: A DIRETIVA FOR MOSTROU-SE SER DE MENOR TEMPO DE EXECUÇÃO PARA EM COMPARAÇÃO COM A DIRETIVA WHILE (PARA ESSA INSTRUÇÃO)!
		System.out.print("Valor inteiro para for: ");
		int i = s.nextInt();
		for (; i>=0; i--) { //Diretiva(Statement) for simples → ([inicialização]; [condição]; [decremento--])
			System.out.println("(for simples) " + i); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		}

		/* 2°-Estruturas de Repetição Condicional: Diretiva(Statement) do while______________________________________________________________________
		 * Semântica:
		 * 	do {
		 * 		diretiva;
		 * } while ( < condição > ); */

		// Exemplo: Diretiva(Statement) do while:
		System.out.print("Valor inteiro inferior: "); // uma Diretiva(Statement) →(;)
		int min = s.nextInt(); // uma Diretiva(Statement) →(;)
		System.out.print("Valor inteiro superior: "); // uma Diretiva(Statement) →(;)
		int max = s.nextInt(); // uma Diretiva(Statement) →(;)
		
		do {
			System.out.println(min + " < " + max); // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
			min++; max--; // do { bloco } →um grupo de diretivas(statments), ao invés de uma diretiva;
		} while (min < max); // Diretiva(Statement) while → ( < condição > );

		System.out.println(min + " == " + max + " Valores igualados!"); // uma Diretiva(Statement) →(;)
	}

}
