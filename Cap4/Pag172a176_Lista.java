import java.util.Scanner;

// CLASSE EXTERNA ou outter class ou enclosing class
public class Pag172a176_Lista {
	public static void main (String arg[]) {
		
		Nodo lista = null; 
		
		Scanner sc = new Scanner(System.in); 
		
		String aux;
		do { 
			System.out.println("Digite uma palavra (. encerra):");
			aux = sc.next();
			if (!aux.equals(".")) {
				Nodo novo = new Nodo(aux, lista);
				lista = novo;
			}
		} while (!aux.equals("."));
		sc.close();
		
		System.out.println("Lista das Palavras:\n");
		
		Nodo nodo = lista; 
		while (nodo!=null) {
			System.out.print(nodo.nome + " ");
			nodo = nodo.proximo;
		}
		System.out.println("<.>");
	}
	
	// CLASSE ANINHADA ESTÁTICA → (lembrando: Classes aninhadas estáticas não são, formalmente, consideradas CLASSES INTERNAS)
	private static class Nodo {
		public String nome;
		public Nodo proximo;
	
		@SuppressWarnings("unused")
		public Nodo () { 
			this(null, null); 
		}
		public Nodo (String n, Nodo p) {
			nome = n; proximo = p;
		}
	}
}
