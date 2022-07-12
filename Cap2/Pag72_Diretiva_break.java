import java.util.Scanner;

public class Pag72_Diretiva_break {
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


		/* 5°-Estrutura de Desvio de Fluxo Incondicional: diretiva (Statement) break_______________________________________________________________
		 * A diretiva break provoca a interrupção em estrutura de repetição for, while e do while e estrutura de desvio switch */
		
		// Exemplo: Diretiva(Statement) break em for:
		// leitura do número máximo de pares desejados
		System.out.print("Maximo no pares ? ");
		Scanner s = new Scanner(System.in); // Prepara entrada de dados criando o objeto leitor s para uso das ENTRADAS FORMATADAS (Pag45_EntradaFormatada)
		int max = s.nextInt(); // variável p/ número máximo de pares
		int pares = 0; // variável p/ contar pares encontrados
		for (int i=1; i<1000; i++) { // for com variável imediata
			if (i%2==0) {
				pares++;
				System.out.printf("i = %4d  pares = %4d%n", i, pares); 
			}
			if (pares==max) { break; } // break provoca a interrupção
		}
		s.close(); // Fecha objeto leitor s, evitando a perda de recursos e impedindo o uso posterior do dispositivo de entrada

		
		/* 5°-Estrutura de Desvio de Fluxo Incondicional: diretiva (Statement) continue____________________________________________________________
		 * A diretiva break provoca a interrupção em estrutura de repetição for, while e do while, fazendo com que a
		 * estrutura de repetição continue direto para a próxima iteração, pulando as diretivas seguintes finais...*/
		
		// Exemplo: Diretiva(Statement) continue em for:
		int soma = 0; // variável para armazenar soma
		for (int i=0; i<=100; i++) { // laco de 0 a 100
			// abrevia iteração se múltiplo de 2, 3 ou 5
			if (i%2==0 || i%3==0 || i%5==0) { //se o contador é multiplo se 2, 3 ou 5
				System.out.println("i = "+ i + " multiplo de 2, 3 ou 5");
				continue; // provoca a interrupção da estrutura de repetição e continua direto para a próxima iteração
			}
			// processamento normal para demais casos, se if não for True
			soma = soma + i;
			System.out.println("i = " + i + "  soma = "+ soma);
		}
} }
