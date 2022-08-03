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


		// uso da diretiva for comum com arranjos_______________________________
		int a[] = new int[10]; // declara e aloca arranjo inteiro
		Scanner sc = new Scanner(System.in); 
		for (int i=0; i<a.length; i++) { // for comum com arranjos
			System.out.print("a[" + i + "]? ");
			a[i] = sc.nextInt();
		}
		int soma = 0; // exibe arranjo e soma seus elementos
		for (int i=0; i<a.length; i++) { // for comum com arranjos
			System.out.println("a[" + i + "] = "+ a[i]);
			soma += a[i];
		}
		System.out.println("Soma = "+ soma);
		sc.close();


		// uso da diretiva for avançada com arranjos_______________________________
		Scanner sc2 = new Scanner(System.in); 
		System.out.print("No de elementos ? ");  
		int tamanho = sc2.nextInt();
		assert tamanho>0; // uso de assert → pág 81
		int arranjo[] = new int[tamanho]; // declara e aloca arranjo inteiro
		for (int i=0; i<tamanho; i++) {  // for comum com arranjos
			System.out.print("Elemento["+ i + "]? ");
			arranjo[i] = sc2.nextInt();
		}
		sc2.close();
		int soma2 = 0;
		System.out.print("[ ");
		for (int elemento: arranjo) { // for avançada com arranjos
			soma2 += elemento; // soma2 elementos
			System.out.print(elemento + " ");
		}
		System.out.println("] soma2 = " + soma2);
	}
}
