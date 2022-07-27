import java.util.Scanner;

public class Pag83a90_Arranjos_e_Matrizes {
	public static void main (String args[]) {
		/* Arranjos—————————————————————————————————————————————————————————————————————
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
		int a[] = new int[10]; // declara e aloca arranjo inteiro
		Scanner sc = new Scanner(System.in); // prepara console
		for (int i=0; i<a.length; i++) { // a.length retorna o número de elementos
			System.out.print("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0; // exibe arranjo e soma seus elementos
		for (int i=0; i<a.length; i++) {
			System.out.println("a[" + i + "] = "+ a[i]);
			soma += a[i];
		}
		System.out.println("Soma = "+ soma); // exibe soma obtida
		sc.close();
	}
}
