import java.util.*;

public class Pag187_UsaTipoNum {
	public static void main (String a[]) {
		Scanner sc = new Scanner(System.in);
		List<Pag187_TipoNum<String>> lista = 
			new ArrayList<Pag187_TipoNum<String>>();
			
		while(true) {
			System.out.print("Digite um nome (. finaliza): ");
			String nome = sc.next();
			if (nome.equals(".")) break;
			System.out.print("Digite um numero: ");
			int id = sc.nextInt();
			lista.add(new Pag187_TipoNum<String>(id, nome));
		}
		sc.close();
		for(Pag187_TipoNum<String> el: lista) {
			System.out.println("#"+ el.getId() + ": " 
				+ el.getValor());
		}
	}
}
