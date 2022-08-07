import java.util.Scanner;
import java.util.Arrays;

public class Pag83a90_Arranjos_e_Matrizes {
	public static void main (String args[]) {
		/* Arranjos———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
		 * •Declaração:
		 * → <Tipo> identificador[]; // forma comum
		 * → <Tipo>[] identificador; // forma preferencial
		 * 
		 * •Alocação: // Arranjos são objetos portanto devem ser alocados com new
		 * → identificador = new <Tipo> [tamanho]; 
		 * 
		 * •Declaração com alocação:
		 * → <Tipo> identificador[] = new <Tipo> [tamanho];
		 * → <Tipo>[] identificador = new <Tipo> [tamanho]; // forma preferencial */


		// uso da diretiva for comum com arranjos_______________________________________________________________________
		int a[] = new int[10]; // declara e aloca arranjo inteiro
		Scanner sc = new Scanner(System.in); 
		for (int i=0; i<a.length; i++) { // laço for comum destinado ao preenchimento de arranjo (comparação linha 64)
			System.out.print("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0; 
		for (int i=0; i<a.length; i++) { // laço for comum destinado a exibição de arranjo (comparação linha 48)
			System.out.println("a[" + i + "] = "+ a[i]);
			soma += a[i];
		}
		System.out.println("Soma = "+ soma);
		sc.close();


		// uso da diretiva for avançada com arranjos____________________________________________________________________
		Scanner sc2 = new Scanner(System.in); 
		System.out.print("No de elementos ? ");  
		int tamanho = sc2.nextInt();
		assert tamanho>0; // uso de assert → pág 81
		int arranjo[] = new int[tamanho]; // declara e aloca arranjo inteiro
		for (int i=0; i<tamanho; i++) {  // laço for comum destinado ao preenchimento de arranjo (comparação linha 64)
			System.out.print("Elemento["+ i + "]? ");
			arranjo[i] = sc2.nextInt();
		}
		sc2.close();
		int soma2 = 0;
		System.out.print("[ ");
		for (int elemento: arranjo) { // laço for avançado destinado a exibição de arranjo (comparação linha 27)
			soma2 += elemento; 
			System.out.print(elemento + " ");
		}
		System.out.println("] soma2 = " + soma2);


		// Operações com arranjos (classe Arrays)_______________________________________________________________________
		Scanner sc3 = new Scanner(System.in);
		System.out.print("No de elementos ? ");
		int tamanho_arranjo = sc3.nextInt();

		System.out.print("Preenchimento real? ");
		double valor = sc3.nextDouble();

		double arranjo1[] = new double[tamanho_arranjo];
		Arrays.fill(arranjo1, valor); // o método fill da classe Arrays preenche o arranjo → substitui um laço comum destinado ao preenchimento como o da linha 22 e da linha 41
		
		System.out.println(Arrays.toString(arranjo1)); // o método toString da classe Arrays exibe o arranjo 
		
		System.out.print("Posicao inicial da copia? "); 
		int de = sc3.nextInt();
		System.out.print("Posicao final da copia? ");
		int para = sc3.nextInt();
		
		double arranjo2[] = Arrays.copyOfRange(arranjo1, de, para); // o método copyOfRange da classe Arrays copia de um índice a outro índice
		double arranjo3[] = Arrays.copyOf(arranjo1, arranjo1.length); // o método copyOf da classe Arrays copia do início até um índice
		
		System.out.println("Copia parcial:\n" + Arrays.toString(arranjo2)); // o método toString da classe Arrays exibe o arranjo 
		System.out.println("Copia total:\n" + Arrays.toString(arranjo3)); // o método toString da classe Arrays exibe o arranjo 
		sc3.close();

		double arr1[] = {13.5, -1.4, 327, 0, 12, 3};
		double arr2[] = Arrays.copyOf(arr1, arr1.length); // cópia do arr1 para mantê-lo inalterável (pois o método sort, abaixo↓, faz com que os elementos do arranjo sejam reposicionados)
		Arrays.sort(arr2); // o método sort da classe Arrays faz a ordenação do argumento arranjo, utilizando internamente o algoritmo QuickSort (o mais rápido conhecido para ordenação, portanto o mais indicado)

		/* Matrizes———————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————————
		 * •Declaração:
		 * → <Tipo> identificador[][]...[]; // forma comum
		 * → <Tipo>[][]...[] identificador; // forma preferencial
		 * 
		 * •Alocação:
		 * → identificador = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N]; 
		 * 
		 * •Declaração com alocação:
		 * → <Tipo> identificador[][]...[] = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N];
		 * → <Tipo>[][]...[] identificador = new <Tipo> [dimensão_1][dimensão_2]...[dimensão_N]; // forma preferencial */
		
		
		// Declaração e uso de matriz comum_____________________________________________________________________________
		double mb[][] = new double[3][4]; // declara e aloca matriz 3x4
		for (int l=0; l<mb.length; l++) { // mb.length faz a leitura da quantidade de linhas
			for (int c=0; c<mb[l].length; c++) { // mb[l].length faz a leitura da quantidade de colunas da linha l
				mb[l][c] = l*mb[l].length + c; // aloca o valor da operação na coluna c da linha l na matriz mb
		}	}
		for (int l=0; l<mb.length; l++) { // mb.length faz a leitura da quantidade de linhas
			for (int c=0; c<mb[l].length; c++) { // mb[l].length faz a leitura da quantidade de colunas da linha l
				System.out.print(mb[l][c] + "\t"); // exibe cada elemento referente a cada coluna de cada linha da matriz
			}
			System.out.println();
		}
	

		// Declaração e uso de matriz triangular_______________________________________________________________________
		double mt[][]; // declara matriz
		mt = new double[4][]; // aloca matriz parcialmente
		int aux = 0; // variável auxiliar
		for (int l=0; l<mt.length; l++) { // mt.length faz a leitura da quantidade de linhas
			mt[l] = new double[l+1]; // completa alocação
			for (int c=0; c<mt[l].length; c++) { // mt[l].length faz a leitura da quantidade de colunas da linha l
				mt[l][c] = aux++; // aloca aux na coluna c da linha l na matriz mt
		}	}
		for (int l=0; l<mt.length; l++) { // exibe matriz
			for (int c=0; c<mt[l].length; c++) {
				System.out.print(mt[l][c] + "\t");
			}
			System.out.println();
		}
	}
}
